package chapter1.class4

fun echo(name: String) {
    println("$name")
 }

/**
 * 带默认值的函数，可大大减少方法重载的数量
 */
fun echo2(name: String = "huangjian") {
    println(name)
}

/**
 * 函数体只有一个语句时，可以直接赋值给函数
 */
fun echo3(name: String) = println("$name")


/**
 * 函数嵌套。不建议使用
 * 递归调用时，或者不希望函数被外部访问时可以使用内部函数
 */
fun function() {
    val str = "hello world"
    fun say(count: Int = 10) {
        println(str + count)
        if (count > 1) {
            say(count - 1)
        }
    }
    say()
}

fun main(args: Array<String>) {
    echo("hello")
    echo2()
    echo2("hello2")
    echo3("hello3")

    function()
}