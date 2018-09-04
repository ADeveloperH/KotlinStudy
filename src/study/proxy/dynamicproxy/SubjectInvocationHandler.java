package study.proxy.dynamicproxy;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类对应的调用处理程序类
 *
 * 接口增加方法时动态代理不需要改变
 *
 */
public class SubjectInvocationHandler implements InvocationHandler {
    private final Object delegate;

    public SubjectInvocationHandler(@NotNull Object delegate) {
        this.delegate = delegate;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        long startTime = System.currentTimeMillis();
        method.invoke(delegate, objects);
        System.out.println("执行任务耗时：" + (System.currentTimeMillis() - startTime));
        return null;
    }
}
