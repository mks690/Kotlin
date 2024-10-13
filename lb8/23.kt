fun main() {

    print("Введите строку: ")
    val inputString = readln()

    val charCount = countCharacters(inputString)
    println("Количество символов в строке '$inputString': $charCount")
}

fun countCharacters(str: String): Int {
    return str.length
}
