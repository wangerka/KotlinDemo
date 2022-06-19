open abstract class Duck {

    lateinit var flyBehavior:FlyBehavior
    lateinit var quackBehavior:QuackBehavior

    fun swim(){//所以的子类都有的行为 统一在父类中实现
        println("所有的鸭子都会游泳。。。")
    }

    abstract  fun display()//每个鸭子外观不同，所以要具体的子类去实现

    fun performFly(){
        flyBehavior.fly()
    }

    fun performQuack(){
        quackBehavior.quack()
    }
}

fun main() {
    val d1  = Duck1()
    d1.display()
    d1.performQuack()
    d1.performFly()
    println("####################################")
    val d2 = Duck2()
    d2.display()
    d2.performFly()
    d2.performQuack()
    println("修改d2的飞行行为flyB1")
    d2.flyBehavior = FlyB1()
    d2.performFly()
}