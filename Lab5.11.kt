fun main() {
    println("Введите первую строку:")
    val str1:String = readLine().toString()
    println("Введите вторую строку:")
    val str2:String = readLine().toString()

    if (anagrams(str1, str2)) {
        println("Строки являются анаграммами.")
    } else {
        println("Строки не являются анаграммами.")
    }
}

fun anagrams(str1: String, str2: String): Boolean {
    val normalizedStr1 = str1.replace(" ", "").toLowerCase().toCharArray().sorted()
    val normalizedStr2 = str2.replace(" ", "").toLowerCase().toCharArray().sorted()
    return normalizedStr1 == normalizedStr2
}