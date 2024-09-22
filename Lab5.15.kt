fun main(){
    println("Введите строку, которую хотите проверить на палиндром: ")
    var a = readlnOrNull(); var b:String
    if (a != null) {
        if (a.isEmpty()) return println("Exit")
    }
    a = a?.replace(" ", "")
    b = a!!.reversed()
    if (a == b) println("Палиндром")
    else println("Не палиндром")
}