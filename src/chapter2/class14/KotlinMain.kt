package chapter2.class14

fun main(args: Array<String>) {

    //[1-10]
    for (i in 1..10) {
        println(i)
    }

    //[1-10) 也就是 [1-9]
    for (i in 1 until 10) {
        println(i)
    }

    //[10-1] 逆序输出
    for (i in 10 downTo 1) {
        println(i)
    }

    //步长为 2
    for (i in 1..10 step 2) {
        println(i)
    }

    //[0-9]高级函数。传入闭包，表示循环的次数，it 表示当前循环的 index
    repeat(10) { println(it)}

    val arrayList = arrayListOf<String>("a", "b", "c", "d")
    for (string in arrayList) {
        println(string)
    }

    arrayList.forEach {
        println(it)
    }

    //使用解构获取。map 可以直接使用，list 需要调用 withIndex 函数
    for ((index, str) in arrayList.withIndex()) {
        println("第$index 个元素是 $str")
    }

    repeat(arrayList.size) {
        println("第 ${it + 1} 个元素是 ${arrayList.get(it)}")
    }
}



