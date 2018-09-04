package chapter1.class1

/**
 * 变量名在前，变量类型在后，如果类型能推断可以不用写类型
 */

//var 表示变量
var age: Int = 28

//val 表示不可变的变量。注意：不是常量
val name: String = "huangjian"

//如果类型可以推断出来，可以不用写类型
var sex = "male"


var str1: String = "test"
//String 和 String? 是两种不同的类型。是不能互相赋值的
//String 类型是不可为空的，如果设置为空编译器会报错
//String? 是可以为空也可以不为空的类型
var str2: String? = "test2"

fun main(args: Array<String>) {
    //不能直接赋值，因为是两种不同的类型，如果能保证 str2 不为空，可以加  !! 进行强转赋值
    str1 = str2!!

    //可以直接赋值，因为 String? 表示可以为空和不可为空的类型，其中包含 String
    str2 = str1

    //入参不能是 String? 类型
//    pringLn(str2)

    pringLn(str1)
}


/**
 * 函数以关键字 fun 标识
 * 1、函数参数声明和变量声明一致
 * 2、函数返回值在函数体后声明
 */
fun pringLn(arg: String): String {
    //Kotlin 的模板语法：可以使用 $ 在字符串中引用变量
    println("字符串为：$arg")
    return arg
}

