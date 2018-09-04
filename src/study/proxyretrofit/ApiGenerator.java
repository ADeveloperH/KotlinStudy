package study.proxyretrofit;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class ApiGenerator {
    //缓存了动态代理生成的对象,防止重复创建Api的代理类造成额外的性能消耗。
    private static final Map<String, Object> sApiCache = new HashMap<>();

    private static IExecutor iExecutor;

    private static class SubjectInvocationHandler<T> implements InvocationHandler {

        private final Class<T> apiInterface;

        public SubjectInvocationHandler(Class<T> apiInterface) {
            this.apiInterface = apiInterface;
        }

        @Override
        public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
            IRequest iRequest = resolveRequest(method, objects, apiInterface);
            if (iExecutor == null) {
                iExecutor = defaultExecutor();
            }

            return iExecutor.executor(iRequest);
        }

        private IRequest resolveRequest(Method method, Object[] objects, Class<T> apiInterface) {
            StringBuilder urlBuilder = new StringBuilder();
            Map<String, Object> params = null;
            if (apiInterface.isAnnotationPresent(Url.class)) {
                String baseUrl = apiInterface.getAnnotation(Url.class).value();
                if (isNotEmpty(baseUrl)) {
                    urlBuilder.append(baseUrl);
                }
            }

            if (method.isAnnotationPresent(Url.class)) {
                String subUrl = method.getAnnotation(Url.class).value();
                if (isNotEmpty(subUrl)) {
                    urlBuilder.append(subUrl);
                }
            }

            int index = 0;
            for (Annotation[] annotations : method.getParameterAnnotations()) {
                for (Annotation annotation : annotations) {
                    if (annotation instanceof Param) {
                        String key = ((Param) annotation).value();
                        if (isNotEmpty(key)) {
                            if (params == null) {
                                params = new HashMap<>();
                            }
                            params.put(key, objects[index]);
                        }
                    }
                }
                index++;
            }
            return new Request(urlBuilder.toString(), params, method.getReturnType());
        }

        private IExecutor defaultExecutor() {
            return new DefaultExecutor();
        }
    }

    private static boolean isNotEmpty(String string) {
        return string != null && !"".equals(string);
    }


    public static <T> T generateApi(Class<T> apiInterface) {
        if (apiInterface == null || !apiInterface.isInterface()) {
            throw new RuntimeException("the apiInterface is null or isnot interface");
        }
        synchronized (ApiGenerator.class) {
            Object api = sApiCache.get(apiInterface);
            if (api == null) {
                api = Proxy.newProxyInstance(apiInterface.getClassLoader(),
                        new Class[]{apiInterface},
                        new SubjectInvocationHandler<>(apiInterface));
            }
            return (T) api;
        }
    }
}
