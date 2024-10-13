fun main() {

    print("Введите строку: ")
    val inputString = readln()

    val stringWithoutSpaces = removeSpaces(inputString)
    println("Оригинальная строка: $inputString")
    println("Строка без пробелов: $stringWithoutSpaces")
}

fun removeSpaces(str: String): String {
    return str.replace(" ", "")
}
