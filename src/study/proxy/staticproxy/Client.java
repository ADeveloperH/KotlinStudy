package study.proxy.staticproxy;

public class Client {
    public static void main(String[] args){
        SubjectStaticFactory.getInstance().dealTask("静态代理执行任务");
        SubjectStaticFactory.getInstance().dealOtherTask("静态代理执行其他任务");
    }
}
