fun main() {

    print("Введите первую строку: ")
    val str1 = readln()

    print("Введите вторую строку: ")
    val str2 = readln()

    if (areAnagrams(str1, str2)) {
        println("$str1 и $str2 - анаграммы")
    } else {
        println("$str1 и $str2 - не анаграммы")
    }
}
