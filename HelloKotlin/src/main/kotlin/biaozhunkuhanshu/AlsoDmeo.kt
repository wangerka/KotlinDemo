package biaozhunkuhanshu

class Person(name:String,age:String,about:String){
    val name = name
}

fun main() {
    val jake2 = Person("Jake", "30", "Android developer")   // 1
    jake2.also {
        println("A new person ${it.name} was created.")
    }

}