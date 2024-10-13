fun main() {

    print("Введите основную строку: ")
    val mainString = readln()

    print("Введите подстроку для поиска: ")
    val substring = readln()

    val containsSubstring = containsSubstring(mainString, substring)
    if (containsSubstring) {
        println("Подстрока '$substring' содержится в строке '$mainString'")
    } else {
        println("Подстрока '$substring' не содержится в строке '$mainString'")
    }
}

fun containsSubstring(mainString: String, substring: String): Boolean {
    return mainString.contains(substring)
}
