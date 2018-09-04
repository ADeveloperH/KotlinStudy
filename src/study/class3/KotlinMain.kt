package study.class3

fun main(args: Array<String>) {
    testLambda()
    run(::testLambda)
    testLambda2()
}


fun testLambda() {
    var intList = listOf<Int>(1, 2, 3, 4, 5, 23, 23, 1, 4564, 21)
    var testList = listOf<Int>()
    var arrayListOf = arrayListOf<Int>()
    var arrayList = ArrayList<Any>()
    var mutableListOf = mutableListOf<Int>()
    val message = intList?.maxBy { it }
    println(message)

//    intList.forEach {
//        println(it)
//    }
}

data class ArtList(val name: String){
    fun print(){
        println(name)
    }
}

data class Person(val name: String, val age: Int)

fun Person.isAult() = age > 21
fun testLambda2() {
    val createPerson = ::Person
    val p = createPerson("huangjian", 27)
    println(p)

    val predicate = Person::isAult
    println(predicate(p))

    val predicate2 = p::isAult
    println(predicate2())

    val stringList = listOf<String>("a", "ab", "b")
    println(stringList.groupBy { it.first() })
    println(stringList.groupBy(String::first))

}
