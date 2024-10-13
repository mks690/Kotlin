fun main() {

    print("Введите строку: ")
    val inputString = readln()

    val vowelCount = countVowels(inputString)

    println("Строка: $inputString")
    println("Количество гласных: $vowelCount")
}

fun countVowels(str: String): Int {
    val vowels = "aeiouAEIOU"
    var count = 0

    for (char in str) {
        if (vowels.contains(char)) {
            count++
        }
    }

    return count
}
