fun main() {

    print("Введите элементы массива (через пробел): ")
    val inputArray = readln().split(" ").map { it.toInt() }.toIntArray()

    val reversedArray = reverseArray(inputArray)

    println("Оригинальный массив: ${inputArray.contentToString()}")
    println("Перевернутый массив: ${reversedArray.contentToString()}")
}

fun reverseArray(arr: IntArray): IntArray {
    return arr.reversedArray()
}
