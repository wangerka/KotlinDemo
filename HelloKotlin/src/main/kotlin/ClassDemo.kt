import java.util.*

//get set方法是自动生成的
class Player{
    var name = "jack"
//        get() = field.capitalize()
    get() = field.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    set(value) {
        field = value.trim()//去除前后空格，中间空格依然保留
    }
}

fun main() {
    var p = Player()//不需要new了
    println(p.name)
    p.name = "  ros  e   "
    println(p.name)

    println((1..9).shuffled().take(3))//shuffled 洗牌功能 随机
}