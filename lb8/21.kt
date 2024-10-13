fun main() {

    print("Введите элементы массива (через пробел): ")
    val inputArray = readln().split(" ").map { it.toInt() }.toIntArray()

    val sortedArray = sortArray(inputArray)
    println("Отсортированный массив: ${sortedArray.contentToString()}")
}

fun sortArray(arr: IntArray): IntArray {
    return arr.sortedArray()
}
