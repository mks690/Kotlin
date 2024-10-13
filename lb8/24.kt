fun main() {

    print("Введите строку: ")
    val inputString = readln()

    val uppercaseString = convertToUppercase(inputString)
    println("Строка в верхнем регистре: $uppercaseString")
}

fun convertToUppercase(str: String): String {
    return str.uppercase()
}
