fun main() {

    print("Введите строку: ")
    val inputString = readln()

    val vowelCount = countVowels(inputString)
    val consonantCount = countConsonants(inputString)

    println("Количество гласных: $vowelCount")
    println("Количество согласных: $consonantCount")
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

fun countConsonants(str: String): Int {
    val consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ"
    var count = 0

    for (char in str) {
        if (consonants.contains(char) && !countVowels(char.toString()).equals(1)) {
            count++
        }
    }

    return count
}
