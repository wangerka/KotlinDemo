package biaozhunkuhanshu

fun main() {
    /**
     * run = str = test
     * result = TEST
     * empty2 = 4
     */
    val empty2 = "test".run {
        println("run = str = $this")
        val resultStr = this.uppercase()
        println("result = $resultStr")
        resultStr
        // this.length  this可以省去
        length
    }

    println(empty2)

}