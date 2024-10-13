fun main() {

    print("Введите строку: ")
    val inputString = readln()

    if (isPalindrome(inputString)) {
        println("Строка '$inputString' является палиндромом")
    } else {
        println("Строка '$inputString' не является палиндромом")
    }
}

fun isPalindrome(str: String): Boolean {
    val cleanedStr = str.lowercase().replace(" ", "")
    val reversedStr = cleanedStr.reversed()
    return cleanedStr == reversedStr
}
