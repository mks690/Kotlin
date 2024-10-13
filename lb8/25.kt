fun main() {

    print("Введите первую строку: ")
    val firstString = readln()

    print("Введите вторую строку: ")
    val secondString = readln()

    val combinedString = concatStrings(firstString, secondString)
    println("Объединенная строка: $combinedString")
}

fun concatStrings(str1: String, str2: String): String {
    return str1 + str2
}
