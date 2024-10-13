fun main() {

    print("Введите строку: ")
    val inputString = readln()

    val reversedString = reverseCase(inputString)
    println("Строка с измененным регистром: $reversedString")
}

fun reverseCase(str: String): String {
    val sb = StringBuilder()

    for (char in str) {
        sb.append(if (char.isUpperCase()) char.lowercase() else char.uppercase())
    }

    return sb.toString()
}
