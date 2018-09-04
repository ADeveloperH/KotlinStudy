package study.proxy.staticproxy;

import org.jetbrains.annotations.NotNull;
import study.proxy.Subject;

/**
 * 静态代理需要实现接口的所有方法
 */
public class ProxySubject implements Subject {
    private final Subject delegate;

    public ProxySubject(@NotNull Subject delegate) {
        this.delegate = delegate;
    }

    @Override
    public void dealTask(String taskName) {
        long startTime = System.currentTimeMillis();
        delegate.dealTask(taskName);
        System.out.println("执行任务耗时 ：" + (System.currentTimeMillis() - startTime));
    }

    @Override
    public void dealOtherTask(String taskName) {
        long startTime = System.currentTimeMillis();
        delegate.dealOtherTask(taskName);
        System.out.println("执行其他任务耗时 ：" + (System.currentTimeMillis() - startTime));
    }
}
