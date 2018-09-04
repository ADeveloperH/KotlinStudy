package chapter2.class11

interface Animal{
    fun bark()
}

class Dog : Animal {
    override fun bark() {
        println("狗叫")
    }
}

//Kotlin 动态代理会被转换成静态代理，比 Java（最终通过反射） 效率高
class Zoo(animal: Animal) : Animal by animal{
//    override fun bark() {
//        println("Zoo bark")
//    }
}
