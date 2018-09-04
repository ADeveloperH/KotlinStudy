package chapter1.class2

import kotlin.reflect.KClass

//最终被编译成 public 变量
var name = "huangjian"

/**
 * Kotlin 的函数直接可以写在文件中，不用写在类中
 * 最终被编译成 public 的方法，在 Java 类中可以直接通过文件名调用该方法
 */
fun echo(name: String) {
    println("$name")
}

fun main(args: Array<String>) {
    //Kotlin 中可以直接调用匿名类的方法
    Test.sayMsg("hello from Kotlin")
}

/**
 * 匿名内部类的写法
 */
object Test {
    fun sayMsg(msg: String) {
        println(msg)

        //java 的 class 对象传入方式
        testClass(JavaMain::class.java)

        //kotlin 的 class 对象传入方式
        testClass(KotlinMain::class)

        //kotlin 掉 Java 变量，变量名与 kotlin 的关键字冲突时使用 ``
        println(JavaMain.`in`)
    }
}

/**
 * 测试入参为 Java 的 Class
 */
fun testClass(clazz: Class<JavaMain>) {
    println(clazz.simpleName)
}

/**
 * 测试入参为 Kotlin 的 Class。Kotlin 的 Class 为 KClass
 */
fun testClass(clazz: KClass<KotlinMain>) {
    println(clazz.simpleName)
}