package study.proxy;

public class RealSubject implements Subject {
    @Override
    public void dealTask(String taskName) {
        System.out.println("正在执行：" + taskName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void dealOtherTask(String taskName) {
        System.out.println("正在执行：" + taskName);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
