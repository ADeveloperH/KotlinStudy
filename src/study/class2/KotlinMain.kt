package study.class2

import sun.misc.Cleaner

val strings: List<String> = listOf("first", "second", "fourteenth")
val numbers: Collection<Int> = setOf(1, 2, 3, 100)

fun main(args: Array<String>) {
    println(strings.last())
    println(numbers.max())

    testVarag(1, 2, 3, 4, 100)
    testSplit("12.3123.a.23-324")

    val button = Button()
    button.click()
    button.setFocus(false)
    button.showOff()

    val user = User("huangjian")
    println(user.address)
    user.address = "beijing"
    println(user.address)

    val lengthCounter = LengthCounter()
//    lengthCounter.counter = 10
    lengthCounter.addWord("hello")
    println(lengthCounter.counter)

    val client = Client("huangjian","beijing")
    val client2 = Client("huangjian","beijing")
    client.name = "HuangJian"
    client2.name = "HuangJian"
    println(client.toString())
    println(client == client2)
    println(client === client2)

    val clientSet = setOf<Client>(client)
    println(clientSet.contains(client2))

    val client3 = Client2("huangjian","beijing")
    println(client3.toString())


}

fun testVarag(vararg values: Int) {
    val test: IntArray = values
    println(test[3])

    println(values.javaClass.simpleName)
    println(values[1])
    testVararg2(values)
}

fun testVararg2(vararg values: Any) {
    val test = values[0] as IntArray
    println(test[0])
}

fun testSplit(string: String) {
    println(string.split("\\.".toRegex()))
    println(string.split("""\.""".toRegex()))
    println(string.split(".", "-"))
}


open class View {
    constructor(int: Int)
    constructor(string: String)
}

class MyButton : View {
    constructor(int: Int) : this(int.toString()) {
    }

    constructor(string: String) : super(string)
}

class User(val name: String) {
    var address: String = "unspecified"
        get() {
            return field + "======heihei"
        }
        set(value: String) {
            field = value + "=====haha"
        }
}

class LengthCounter {
    init {

    }
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

class Client(var name: String, val address: String){
    override fun toString(): String {
        return "Client[$name,$address]"
    }

    override fun equals(other: Any?): Boolean {
        if (other !is Client) {
            return  false
        }
        return other.name == name && other.address == address
    }

    override fun hashCode(): Int {
        return name.hashCode() + address.hashCode()
    }
}

data class Client2(var name: String, val address: String)

class Person{
    companion object Test{
        fun hello() {

        }
    }
}