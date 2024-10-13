fun main() {

    print("Введите строку: ")
    val inputString = readln()

    val stringLength = getStringLength(inputString)
    println("Длина строки '$inputString' составляет $stringLength символов")
}

fun getStringLength(str: String): Int {
    return str.length
}
