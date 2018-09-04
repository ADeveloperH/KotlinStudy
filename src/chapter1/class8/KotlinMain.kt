package chapter1.class8

fun main(args: Array<String>) {
    //最后一个参数为 Lambda 可以将大括号放到小括号的拿出来
    onlyIf(true) {
        println("hello 高阶函数")
    }

    //最后一个参数需要传入为函数的声明
    onlyIf(true, function)

    val button: View = View()
    button.id = 123123

    button.setOnClick(View.OnClickListener { println("开始设置 listener1") })
    button.setOnClick2 { view: View? ->
        println(view?.id)
        println("开始设置 listener2")
    }
    button.setOnClick2 {
        //Lambda 表达式单个参数会隐式声明为 it 。可以不用声明唯一的参数并忽略 ->，通过 it 来调用
        println(it?.id)
        println("开始设置 listener2")
    }

    button.setOnClick3 {
        println(it?.id)
        println("开始设置 listener3")
    }
}


/**
 * 函数的参数是函数（Lambda）
 *  函数最后一个参数：参数为空 返回值为 Unit 的 Lambda
 *  Unit 是一个没有返回值的函数默认会返回的类型，一般可以省略
 *  这里 Unit 不能省略：https://www.kotlincn.net/docs/reference/lambdas.html#函数类型
 */
/**
 *  Kotlin 中，Lambda 会被编译成一个匿名对象
 * 使用 inline 关键字（内联）可以优化，编译时不会生成额外的对象，调用处直接回拆解方法的调用为语句的调用
 * 从而可以减少创建不必要的对象（以通过源码查看调用处）
 */
inline fun onlyIf(isDebug: Boolean, block: () -> Unit) {
    if (isDebug) block()
}

//声明一个 Runnable 对象
val runnable = Runnable { println("Runnable::run") }

//函数是“一等公民”，可以作为一个变量。声明一个函数：参数为空，返回值为 Unit
// 引用函数声明：对象::函数名，可以作为参数传递给高阶函数 。不能是 对象.函数 ,这样实际调用的是函数的返回值
val function: () -> Unit = runnable::run


/**
 * 模拟设置 View 的 listener
 * 参数为：View.OnClickListener 对象
 */
fun View.setOnClick(listener: View.OnClickListener) {
    setOnClickListener(listener)
}

/**
 * 模拟设置 View 的 listener
 * 参数为： Lambda 表达式。
 */
fun View.setOnClick2(listener: (view: View?) -> Unit) {
    setOnClickListener(listener)
}

/**
 * 模拟设置 View 的 listener
 * 参数为： Lambda 表达式 .可以省略闭包参数名，直接声明类型即可
 */
fun View.setOnClick3(listener: (View?) -> Unit) {
    setOnClickListener(listener)
}