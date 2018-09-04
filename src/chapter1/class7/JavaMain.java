package chapter1.class7;

public class JavaMain {

    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());//main
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());//Thread-0
            }
        });
        thread.start();


        //java 8 Lambda 表达式
        Thread thread1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());//Thread-1
        });
        thread1.start();
    }
}
