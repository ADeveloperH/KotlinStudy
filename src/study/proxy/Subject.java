package study.proxy;

/**
 * 代理接口
 * 代理类和委托类都需要实现
 */
public interface Subject {
    void dealTask(String taskName);

    void dealOtherTask(String taskName);
}
