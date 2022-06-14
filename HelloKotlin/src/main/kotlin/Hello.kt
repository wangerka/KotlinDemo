fun main() {
    val name = 3
    println(name)

    println(Season.SPRING)
    println(Season.SUMMER)
    println(Season.AUTUMN)
    println(Season.WINTER)
//
//    println(Season1.SPRING)
//    println(Season1.SUMMER)
//    println(Season1.AUTUMN)
//    println(Season1.WINTER)
    isRunYear(2008)
    isRunYear(1998)

}

fun isRunYear(year:Int){
    if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0){
       println("$year  is run nian")
    } else {
        println("$year is not run nian")
    }
}