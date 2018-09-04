package study.proxy.dynamicproxy;

public class Client {
    public static void main(String[] args){
        DynamicProxyFactory.getInstance().dealTask("动态代理执行任务");
        DynamicProxyFactory.getInstance().dealOtherTask("动态代理执行其他任务");
    }
}
