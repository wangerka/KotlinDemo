fun main() {

    level(100)
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
        else -> println("E")
    }
}