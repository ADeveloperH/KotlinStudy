package chapter1.class2;

public class JavaMain {

    //测试与 Kotlin 关键字冲突问题
    public static String in = "in";

    public static void main(String[] args){
        //调用 Kotlin 中的函数，直接通过 “文件名Kt.方法名”调用
        //Util 中声明的方法、变量 ，最终都会被编译成 public
        UtilKt.echo(UtilKt.getName());

        //调用匿名内部类
        Test.INSTANCE.sayMsg("hello from main");
    }
}
