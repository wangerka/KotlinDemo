//避免重复，直接在类名后面跟参数
class Person(
     _name:String,
    _age:Int
) {
    var name = _name
        get() = field.capitalize()
        set(value) {
            field = value
        }
    var age = _age
}