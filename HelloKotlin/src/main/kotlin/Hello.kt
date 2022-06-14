fun main() {
    val name = 3
    println(name)

    isRunYear(2008)
    isRunYear(1998)
    isRunYear1(2008)
    isRunYear1(1998)
    println(add(3,4))

}

fun isRunYear(year:Int){
    if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0){
       println("$year   is run nian")
    } else {
        println("$year is not run nian")
    }
}

fun isRunYear1(year:Int){
    when{
        year % 4 == 0 && year % 100 != 0 || year % 400 == 0 -> println("$year   is run nian")
//        year % 400 == 0 -> println("$year  is run nian")
        else -> println("$year is not run nian")
    }
}

fun add(age1:Int, age2:Int):Int = age1 + age2