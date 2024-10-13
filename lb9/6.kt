fun main() {

    print("Введите строки через запятую: ")
    val inputStr = readln()

    val strArray = inputStr.split(",").map { it.trim() }.toTypedArray()

    val sortedStrArray = sortStrings(strArray)

    println("Отсортированный массив строк:")
    sortedStrArray.forEach { println(it) }
}
