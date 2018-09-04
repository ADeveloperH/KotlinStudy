package chapter2.class11

//数据类是 final 的，不能使用 open 修饰，不能被继承
//默认添加 getter/setter 方法，默认实现 toString 、equals、copy 等方法
//查看生成的源码可以了解更多
data class User(val id: Int, val name: String)
