package study.class2

interface Clickable {
    fun click()
    fun showOff() = println("i am from Clickable")
}

interface Focusable {
    fun setFocus(value: Boolean) = println("setFocus is ${value}")

    fun showOff() = println("i am from Focusable")
}