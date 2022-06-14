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

    val result = file2.run {
        readText().contains("hello1")
    }
    println(result)

    file2.writeText("hello gejun")
}