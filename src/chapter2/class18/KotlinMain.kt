package chapter2.class18

fun main(args: Array<String>) {
    `23`()
    ` `()

    val string1 = "string"
    val string2 = String("string".toByteArray())


    //类似于 Java 中的 equals 方法。判断的是值
    println(string1 == string2)
    //类似于 Java 中的 == 。判断的是引用
    println(string1 === string2)

    //相当于直接使用 String
    val typealiasString = TypealiasString("typealias".toByteArray())
    println(typealiasString)
}


//使用反引号来设置函数名为数字（Kotlin 中是不能以数字为函数名的）
//Java 的语法不支持调用该函数。可以通过这种方式设置该函数只在 Kotlin 中使用
fun `23`() {
    println("fun 数字函数名")
}

fun ` `() {
    println("fun 空格函数名")
}

//相当于给 String 起别称。Kotlin 中有很多，例如 TypeAliases.kt 中相关的类
//用于跨平台的兼容性，可以实现映射
public typealias TypealiasString = java.lang.String