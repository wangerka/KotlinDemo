//还可以更省略  不使用临时变量赋值
class Person1(
    name:String,
    age:Int
) {
    var name = name
}

fun main() {
    val p = Person1("jack", 30)
    println(p.name)
}