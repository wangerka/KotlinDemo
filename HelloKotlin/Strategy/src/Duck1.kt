class Duck1 : Duck() {

    init {
        flyBehavior = FlyB1()
        quackBehavior = QuackB1()
    }
    override fun display() {
        println("I am a Duck1")
    }
}