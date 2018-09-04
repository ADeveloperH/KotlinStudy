package study.class2;

public class JavaMain {
    public static void main(String[] args) {
        String[] stringList = new String[]{"a", "b", "c", "d"};
        testVaragr(stringList);
    }


    private static void testVaragr(String... values) {
        System.out.println(values.toString());
        testVaragr2(values);
    }

    private static void testVaragr2(String... values) {
        System.out.println(values.toString());
    }

    interface A{
        void a();
        default void b(){
            System.out.println("hello");
        }
    }


    abstract class TestAbstract{
        abstract void test();
        void test2(){

        }

    }
}
