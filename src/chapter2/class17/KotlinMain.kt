package chapter2.class17

fun main(args: Array<String>) {

    //运算符重载：例如 .. 使用 operator 声明
    // 中缀表达式：例如 step 使用 infix 声明
    for (i in 1..100 step 2) {
    }

    println(5 VS 6)
    println(7 VS 6)

    //中缀表达式也可以这样通过正常的函数调用一样去调用
    println(7.VS(7))
}

sealed class CompareResult {
    object More : CompareResult() {
        override fun toString(): String {
            return "大于"
        }
    }

    object Less : CompareResult() {
        override fun toString(): String {
            return "小于"
        }
    }

    object Equal : CompareResult() {
        override fun toString(): String {
            return "等于"
        }
    }
}

//自定义中缀表达式。
// 扩展函数，Int 为函数的函数接收者
infix fun Int.VS(num: Int): CompareResult =
        if (this < num) {
            CompareResult.Less
        } else if (this > num) {
            CompareResult.More
        } else {
            CompareResult.Equal
        }

