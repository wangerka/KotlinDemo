package biaozhunkuhanshu

import java.io.File

fun main() {
    val text = File("K:\\kotlin\\123.txt")
            //file对象作为参数 传给了takeIf lanbda表达式 的it
//        .takeIf { it.exists() && it.canRead() }
            //和上面的对比，就是把it变成了具体的参数
        .takeIf { file: File ->  file.exists() && file.canRead()}
        ?.readText()

    println(text)



}

fun testWithoutTakeIf() {
    val name = "yanzhikai"
    val hasYan = name.indexOf("yan")
    println("testWithoutTakeIf: hasYan = $hasYan")
    if (hasYan >= 0) {
        println("testWithoutTakeIf: has yan")
    }
    println("testWithoutTakeIf: $name")
}