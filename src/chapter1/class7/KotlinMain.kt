package chapter1.class7

fun main(args: Array<String>) {
    testLambda()
    echo("hello")

    lambdaA(1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 1,
            1, 1, 1, 1, 1)

    lambdaB(1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 1, 1,
            1, 1, 1, 1, 1,
            1, 1, 1, 1, 1, 1)
}

fun testLambda() {

    Thread({ -> println(Thread.currentThread().name) }).start()

    //Lambda 没有参数可以省略箭头
    Thread({ println(Thread.currentThread().name) }).start()

    //Lambda 是函数的最后一个参数，可以将大括号放在小括号外边
    Thread() { println(Thread.currentThread().name) }.start()

    //函数只有一个参数且是 Lambda 可以省略小括号
    Thread { println(Thread.currentThread().name) }.start()

}

//Lambda 闭包声明
val echo = { name: String -> println(name) }

val lambdaA = { a: Int, b: Int, c: Int, d: Int, e: Int,
                f: Int, g: Int, h: Int, i: Int, j: Int,
                k: Int, l: Int, m: Int, n: Int, o: Int,
                p: Int, q: Int, r: Int, s: Int, t: Int,
                u: Int, v: Int ->
    println("huangjian")
}

//Lambda 闭包最多只有22个参数，否则会报错：java.lang.NoClassDefFoundError: kotlin/Function23
//解决方案：使用 Java 代码手动定义 Function23。需要在 kotlin 包下使用 java 代码手动实现
//使用 kotlin 实现会报错：Error:(1, 1) Kotlin: Only the Kotlin standard library is allowed to use the 'kotlin' package
val lambdaB = { a: Int, b: Int, c: Int, d: Int, e: Int,
                f: Int, g: Int, h: Int, i: Int, j: Int,
                k: Int, l: Int, m: Int, n: Int, o: Int,
                p: Int, q: Int, r: Int, s: Int, t: Int,
                u: Int, v: Int, w: Int ->
    println("huangjian")
}

