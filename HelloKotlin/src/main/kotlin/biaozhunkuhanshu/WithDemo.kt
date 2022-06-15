package biaozhunkuhanshu

    class Configuration(var host: String, var port: Int)

    fun main() {
        val configuration = Configuration(host = "127.0.0.1", port = 9000)
        //  其他都是.    只有这个是with(对象)
        with(configuration) {
            println("$host:$port")
        }
        // instead of:
        println("${configuration.host}:${configuration.port}")
    }
