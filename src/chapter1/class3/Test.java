package chapter1.class3;

public class Test {
    public static void main(String[] args) {
        //调用 Kotlin 中的静态方法和静态变量
        KotlinTest.INSTANCE.print(KotlinTest.getStr());
//        KotlinTest.print(KotlinTest.getStr());
    }
}


class A{
    static class B{
        public static void test() {

        }
    }
}
