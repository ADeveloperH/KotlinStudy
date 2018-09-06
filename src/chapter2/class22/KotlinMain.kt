package chapter2.class22

import java.util.*

fun main(args: Array<String>) {

    val hello = Hello()
    println(hello.string)
    println(hello.string2)

    var person = Person(1991)
    println(person.age)
    person.oneYearsLetter()
    println(person.age)

    println(s)
    println(A.s)
    println(B.s)
}


class Hello {
    //var 变量可以有 get / set 方法
    var string: String? = null
            //get 和 set 方法不能直接使用 string（直接使用相当于调用 get 方法了），需要使用 field ，否则会出现循环引用堆栈溢出
        get() {
            return field + "hello"
        }
        set(value) {
            field = value + "set"
        }


    //val 不可以有 set 方法，是不可变量不能再次赋值，但是可以通过重写 get 方法来改变它的值，但是 val 不是常量
    val string2: String? = null
        get() {
            return field + "hello"
        }
}

class Person(var birthYear: Int) {
    val age: Int
        get() {
            return Calendar.getInstance().get(Calendar.YEAR) - birthYear
        }

    fun oneYearsLetter() {
        birthYear--
    }
}


//const 智能修辞 top-level 变量，或 object / companion object 中的属性。不能有 get / set 方法
//const 变量的值必须在编译期间确定下来，所以它的类型只能是 String 或基本类型
const val s = 0

object A {
    const val s = 1
}

class B {
    companion object {
        const val s = 2
    }
}