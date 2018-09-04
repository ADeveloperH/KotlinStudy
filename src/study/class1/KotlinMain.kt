package study.class1

import chapter1.class1.pringLn

fun main(args: Array<String>) {
    println("".test())
    funVal.invoke(2)
    var message = whenTest(Persons("huangjian", 27))
    println(message)
}

val funVal = fun(int: Int) {
    println("test")
}

val last: Int = 100

fun forTest() {
    var listOf = listOf(1, 2, 3)
    val last1 = listOf.max()
    println(last1)
    for (i in 1 until last) {

    }
}

fun whenTest(persons: Persons) = when {
    (persons.name.equals("huangjian") && persons.age == 27) -> true
    (persons.name.equals("huangjian")) -> "hhh"
    (persons.age in 1..100) -> "haha"

    else -> {
        false
    }
}

class Persons(val name: String, val age: Int)
