package chapter1.class10

fun main(args: Array<String>) {

    println(StringUtils.isEmpty("="))
    println(StringUtils2.isEmpty(""))

    Single.getInstance().testInstance()
}

//静态函数的第一种写法。
object StringUtils {
    @JvmStatic
    fun isEmpty(string: String?): Boolean {
        if (string == null) {
            return true
        } else {
            return "" == string
        }
    }
}

//静态函数的第二种写法
class StringUtils2 {
    //伴生对象。编译后的源码可知，会在 StringUtils2 的内部生成一个 Companion 静态类的对象。
    //因此 java 调用的方式是：StringUtils2.Companion.isEmpty("")
    companion object {
        fun isEmpty(string: String?): Boolean {
            if (string == null) {
                return true
            } else {
                return "" == string
            }
        }
    }
}

//单例模式：直接使用 object 或者 使用伴生对象
//伴生对象写法（推荐）
//需要私有化构造函数
class Single private constructor() {
    private object Holder {
        val instance = Single()
    }

    companion object {
        fun getInstance(): Single = Holder.instance
    }

    fun testInstance() {
        println("测试单例模式")
    }
}

