package chapter1.class3

import kotlin.properties.Delegates

object KotlinTest {
    //使用 @JvmStatic 注解，将 Kotlin 中方法声明为静态变量
    @JvmStatic
    val str: String = "str from KotlinTest "

    //使用 @JvmStatic 注解，将 Kotlin 中方法声明为静态方法，在 Java 可以直接通过“类名.方法名”调用
    @JvmStatic
    fun print(str: String) {
        println(str)
    }

}

fun main(args: Array<String>) {

//    val testLazy = TestLazy()
//    testLazy.test()
//    TestLazy.instance.test()
    val testLazy2 = TestLazy2("name")
    testLazy2.test3()
    val list = listOf(1)
    list.forEachIndexed{
        index, i -> println("$index = $i")
    }
}

class TestLazy {
    init {
        println("constructor")
    }

    fun test() {
        println("test")
    }

    companion object {
        val instance: TestLazy by lazy {
            TestLazy()
        }
    }
}

class TestLazy2 {
    constructor() {
        println("constructor2")
    }

    constructor(name: String) {
        println("constructor2name")
    }


    fun test3() {
        println("test3")
    }

    companion object {
        val instace2 = TestLazy2()
    }
}





