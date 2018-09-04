package chapter1.class5


/**
 * Kotlin 中的类默认加上 final 关键字
 * open 表示这个类不是 final 的
 */
open class Animal

class Dog : Animal()

//给 Animal 新增静态方法
fun Animal.name() = "animal"
//给 Dog 新增静态方法
fun Dog.name() = "dog"

//给 Animal 新增静态方法
fun Animal.printName(animal: Animal) {
    println(animal.name())
}
//给 Dog 新增静态方法
fun Dog.printName2(animal: Animal) {
    println(animal.name())
}
//给 Dog 新增静态方法
fun Dog.printName3(dog: Dog) {
    println(dog.name())
}

fun main(args: Array<String>) {
    /**
     * 扩展函数静态解析，没有运行时多态
     */
    Dog().printName(Dog())//输出“animal”
    Dog().printName2(Dog())//输出“animal”
    Dog().printName3(Dog())//输出“dog”
}