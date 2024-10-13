fun main() {

    print("Введите строку: ")
    val inputString = readln()

    val reversedString = reverseString(inputString)
    println("Оригинальная строка: $inputString")
    println("Строка в обратном порядке: $reversedString")
}

fun reverseString(str: String): String {
    return str.reversed()
}
