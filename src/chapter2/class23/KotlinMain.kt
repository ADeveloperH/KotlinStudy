package chapter2.class23

fun main(args: Array<String>) {
    var a: String? = null
    println(getValue(a))
}

fun getValue(s: String?): String {
    return "length:" + s?.length
}