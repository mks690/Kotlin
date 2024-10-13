fun main() {

    print("Введите элементы массива (через пробел): ")
    val inputArray = readln().split(" ").map { it.toInt() }.toIntArray()

    val copiedArray = copyArray(inputArray)

    println("Оригинальный массив: ${inputArray.contentToString()}")
    println("Скопированный массив: ${copiedArray.contentToString()}")
}

fun copyArray(arr: IntArray): IntArray {
    return arr.copyOf()
}
