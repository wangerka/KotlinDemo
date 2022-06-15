package biaozhunkuhanshu

import java.io.File

fun main() {
    val file = File("K:\\kotlin\\123.txt")
    file.setReadable(true)
    file.setWritable(true)
    file.setExecutable(false)

    val file2 = File("K:\\kotlin\\123.txt").apply {
        setReadable(true)
        setWritable(true)
        setExecutable(false)
    }
    println(file2)

    val result = file2.run {
        readText().contains("hello1")
    }
    println(result)

    file2.writeText("hello gejun")
//////////////////////////////////////////初始化对象，并给属性赋值
    val jake = Person1()                                     // 1
    val stringDescription = jake.apply {                    // 2
        this.name = "Jake"                                       // 3
        age = 30
        about = "Android developer"
    }.toString()                                            // 4
    println(stringDescription)
}

data class Person1(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}
