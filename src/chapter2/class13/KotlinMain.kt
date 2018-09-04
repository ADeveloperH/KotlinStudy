package chapter2.class13

fun main(args: Array<String>) {
    val user = User(27, "huangjian")
    //Kotlin  的解构特性。查看源码可以知道具体的实现逻辑
    val (age, name, nickName) = user
    println(age)
    println(name)
    println(nickName)


    val map = mapOf<String, String>("key1" to "value1", "key2" to "value2")
    //循环 map 是使用解构
    for ((key, value) in map) {
        println("$key ========= $value")
    }
}

class User(val age: Int, val name: String) {
    //operator 将一个函数标记为重载一个操作符或实现一个约定
    //方法名称必须以 component+数字 命名
    operator fun component1() = age

    operator fun component2() = name
    operator fun component3() = name
}


