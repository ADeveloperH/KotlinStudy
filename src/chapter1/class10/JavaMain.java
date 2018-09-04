package chapter1.class10;

public class JavaMain {
    public static void main(String[] args) {
        System.out.println(StringUtils.isEmpty(""));
        test();
    }

    //java 调用 kotlin 伴生对象
    public static void test() {
        System.out.println(StringUtils2.Companion.isEmpty(""));
    }
}
