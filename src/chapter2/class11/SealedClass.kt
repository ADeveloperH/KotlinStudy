package chapter2.class11

//密闭类：所有的子类都在一起声明
sealed class SuperCommand {
    object A : SuperCommand()
    object B : SuperCommand()
    object C : SuperCommand()
    object D : SuperCommand()
    //可对枚举类进行扩展
    class E(val id: Int) : SuperCommand()
}
