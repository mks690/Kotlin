fun main() {

    print("Введите строку: ")
    val inputString = readln()

    try {
        val longestWord = findLongestWord(inputString)
        println("Самое длинное слово: $longestWord")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}
