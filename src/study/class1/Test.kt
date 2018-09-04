@file:JvmName("TestKotlin")

package study.class1


class Person(var name: String, val isMarried: Boolean)

class Rectangle(val width: Int, val height: Int) {
    var isSquare: Boolean
        get() = width == height
        set(value) {
            false
        }
}

fun main(args: Array<String>) {
    val person = Person("huangjian", true)
    println(person.name)
    println(person.isMarried)
    person.name = "hello"
    val rectagle = Rectangle(22, 22)
    println(rectagle.isSquare)

    rectagle.isSquare = true
    println(rectagle.isSquare)

    println(testSetof(1, 1))

    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(eval2(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(eval3(Sum(Sum(Num(1), Num(2)), Num(4))))

//    for (i in 1..100) {
//    for (i in 1 until 100) {
    for (i in 100 downTo 1 step 2) {
        println(fizzBuzz(i))
    }

    println("".test())


    var list = listOf(1, 2, 3, 4, 5)
    println(joinToString(list, ";", "(", ")"))
    //调用方法时指定参数，可以结合默认参数，实现 java 中重载的效果
    println(joinToString(list, prefix = "(", postfix = ")", separator = ";"))

    println(list.javaClass)
    list = list.plus(6)
    println(list.joinToString2())
}

fun testSetof(a: Int, b: Int): String {
    when (setOf(a, b)) {
        setOf(1, 1) -> return "都是1"
        setOf(2, 2) -> return "都是2"
        else -> return "都不是"
    }
}

interface Expr

class Num(val value: Int) : Expr

class Sum(val left: Expr, val right: Expr) : Expr

fun eval(expr: Expr): Int {
    //智能类型转换
    if (expr is Num) {
//        val e = expr as Num
        return expr.value
    }

    if (expr is Sum) {
        return eval(expr.left) + eval(expr.right)
    }
    return 0
}

fun eval2(expr: Expr): Int = if (expr is Num) {
    expr.value
} else if (expr is Sum) {
    eval2(expr.left) + eval2(expr.right)
} else {
    0
}

fun eval3(expr: Expr): Int = when (expr) {
    is Num -> expr.value
    is Sum -> eval3(expr.left) + eval3(expr.right)
    else -> 0
}

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "Fizz"
    i % 3 == 0 || i % 5 == 0 -> "Buzz"
    else -> "$i"
}

@JvmOverloads //将指示编译器以从最后一个参数开始逐个忽略每一个参数的方式产生重载的 Java 函数
fun <T> joinToString(collection: Collection<T>, separator: String = ";", prefix: String = "(", postfix: String = ")"): String {
    val sb = StringBuffer(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) {
            sb.append(separator)
        }
        sb.append(element)
    }
    return sb.append(postfix).toString()
}

//以 getter/setter 形式暴露给 Java
var TEST_STRING = "test_string"
//以 psf 形式暴露给 Java
const val TEST_STRING2 = "test_string"

//注意扩展函数并不允许你打破封装。跟定义在类中的方法不同，扩展函数并不能访问私有或保护访问属性的类成员。
fun String.test() = 2

fun <T> Collection<T>.joinToString2(separator: String = ";", prefix: String = "(", postfix: String = ")"): String {
    val sb = StringBuilder(prefix)
    for ((index, element) in withIndex()) {
        if (index > 0) {
            sb.append(separator)
        }
        sb.append(element)
    }
    return sb.append(postfix).toString()
}

var StringBuilder.lastChar: Char
get() = get(length - 1)
set(value) {
    this.set(length - 1, value)}
