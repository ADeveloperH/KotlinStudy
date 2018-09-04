package study.class1;

import java.util.ArrayList;
import java.util.List;

public class JavaMain {

    public static void main(String[] args) {
        Person person = new Person("huangjian", true);
        System.out.println(person.getName());
        System.out.println(person.isMarried());
        person.setName("hello");

        Rectangle rectangle = new Rectangle(22, 22);
        System.out.println(rectangle.isSquare());

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(TestKotlin.joinToString(list));
        TestKotlin.getTEST_STRING();
        String testString2 = TestKotlin.TEST_STRING2;

        //java 中调用扩展函数
        System.out.println(TestKotlin.test(""));

    }
}
