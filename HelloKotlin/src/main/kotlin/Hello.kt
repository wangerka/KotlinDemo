fun main() {
    val name = 3
    println(name)

    isRunYear(2008)
    isRunYear(1998)
    isRunYear1(2008, 28)
    isRunYear1(1998, 29)
    isRunYear1(age = 1998, year = 29)
    println(add(3,4))
    jishuadd()
}

fun isRunYear(year:Int){
    if((year % 4 == 0 && year % 100 != 0) || year % 400 ==0){
       println("$year   is run nian")
    } else {
        println("$year is not run nian")
    }
}

fun isRunYear1(year:Int, age:Int){
    when{
        year % 4 == 0 && year % 100 != 0 || year % 400 == 0 -> println("$year   is run nian")
//        year % 400 == 0 -> println("$year  is run nian")
        else -> println("$year is not run nian")
    }
}

fun add(age1:Int, age2:Int):Int = age1 + age2

fun jishuadd(){
    var result = 0
//    for(i in 1..99){
//        if(i % 2 != 0)  result = result + i
//    }
    for(i in 1..99 step 2){
        result = result + i
    }

    for(i in 100 downTo 0 step 10){
        print(i)
    }

    val arrayList = arrayListOf(1,2,3,4,5,5,6)
    for(i in arrayList){
        print(i)
    }
    for(i in 0 until arrayList.size){
        print(arrayList[i])
    }
    for(i in arrayList.indices){
        print(arrayList[i])
    }
    for((a,b) in arrayList.withIndex()){
        println("index: $a, item: $b")
    }
    println(result)
}