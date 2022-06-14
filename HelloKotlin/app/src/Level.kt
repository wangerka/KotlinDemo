fun main() {

    level(100)
    level(10066)
    level(93)
    level(59)
    level(86)
    level(76)
}

fun level(point:Int){
    when(point){
        in 90..100 -> println("B")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        in 60..69  -> println("D")
        in 0..59  -> println("D")
        else -> println("input error")
    }
}