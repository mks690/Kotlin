fun lenght(a:String): Int {
    return a.length
}
fun main(){
    println("Введите строку: ")
    var str = readln()
    print("Длина вашей строки = ${lenght(str)}")

}