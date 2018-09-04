package study.class2

class Button : Clickable, Focusable {
    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }

     override fun click() {
        println("on click")
    }

}
