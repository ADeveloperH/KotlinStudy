package chapter2.class16

data class User(var age: Int, var name: String)

fun main(args: Array<String>) {
    //作用域函数：Kotlin 内置的可对数据进行变换的函数，与集合的操作符类似。
    // 但是作用域函数可以应用于所的对象
    val user = User(27, "huangjian")

    //let ：返回闭包执行结果，let 可以有闭包参数
    val letResult: String = user.let { user: User -> "let::${user.javaClass}" }
    //当闭包参数只有一个时可以省略，用 it 来引用
//    val letResult: String = user.let { "let::${it.javaClass}" }
    println(letResult)

    //run ：返回闭包执行结果，run 不可以有闭包参数。
    // 使用 this 来表示当前调用的对象 user ，不能使用 it 代替
    val runResult: String = user.run { "run::${this.javaClass}" }
    println(runResult)

    //also ：不返回闭包执行结果，also 可以有闭包参数。
    user.also { println("also::${it.javaClass}") }

    //apply ：不返回闭包执行结果，apply 不可以有闭包参数
    user.apply { println("apply::${this.javaClass}") }

    // also 和 apply 返回值还是当前的对象，所以可以链式调用
    user.also {
        it.age = 18
    }.apply {
        println(this.toString())
    }.apply {
        this.name = "ADeveloperH"
    }.also {
        println(it.toString())
    }

    user.also {
        it.name = ""
    }
    //takeIf 的闭包返回一个判断结果，为 false 时表示 takeIf 函数会返回空。
    user.takeIf { it.name.length > 0 }?.also { println("姓名不为空") } ?: println("姓名为空")

    //takeUnless 与 takeIf 刚好相反，闭包判断结果为 true 时函数会返回空
    user.takeUnless { it.name.length > 0 }?.also { println("姓名为空") } ?: println("姓名不为空")

    //循环执行当前闭包
    repeat(5) {
        println(it)
    }
}


