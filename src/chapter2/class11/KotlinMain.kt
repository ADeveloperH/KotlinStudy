package chapter2.class11

fun main(args: Array<String>) {

    Zoo(Dog()).bark()

    val user = User(3123, "huangjian")
    val user2 = User(3123, "huangjian")
    val user3 = user.copy()
    println(user.name)
    println(user.toString())
    println("user == user2：${user == user2}")
    println("user === user2: ${user === user2}")
    println("user == user3: ${user == user3}")
    println("user === user3: ${user === user3}")
}

