package biaozhunkuhanshu

fun main() {
    /**
     * TEST
     *
     */
    val empty = "test".let {               // 1
        println(it.uppercase())
        it.isEmpty()                       // 3
        println()
        it
    }.let { str: String ->
        println("it = str = $str")
        val resultStr = str.uppercase()
        println("result = $resultStr")
        resultStr
    }
    /**
     * 和上面的对比{}里是一个lambda表达式 str:String -> ...
     * str:String 可以省略 str用it代替即可
     */

    val empty1 = "test".let {               // 1
        println(it.uppercase())
        it.isEmpty()                       // 3
        println()
        it
    }.let {
        println("it = str = $it")
        val resultStr = it.uppercase()
        println("result = $resultStr")
        resultStr
    }
}


