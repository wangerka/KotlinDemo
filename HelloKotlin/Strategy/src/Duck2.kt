class Duck2 : Duck() {

    init {
        flyBehavior = FlyB2()
        quackBehavior = QuackB2()
    }
    override fun display() {
        println("I am a Duck2")
    }
}