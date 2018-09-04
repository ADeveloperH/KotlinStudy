package study.proxyretrofit;

import java.util.Map;

public class DefaultExecutor implements IExecutor {
    @Override
    public <T> T executor(IRequest request) {
        String url = request.getUrl();
        Map<String, Object> params = request.getParams();
        Class<?> responseCls = request.getResponseCls();
        System.out.println("开始进行请求：url:" + url);
        //利用 Gson 将响应数据转为具体的 Bean
        return (T) new User("123","213","123","324");
    }
}
