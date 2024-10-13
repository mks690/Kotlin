fun main() {

    print("Введите элементы массива (через пробел): ")
    val inputArray = readln().split(" ").map { it.toInt() }.toIntArray()

    val maxElement = findMaxElement(inputArray)
    println("Максимальный элемент в массиве: $maxElement")
}

fun findMaxElement(arr: IntArray): Int {
    var maxElement = arr[0]
    for (i in 1 until arr.size) {
        if (arr[i] > maxElement) {
            maxElement = arr[i]
        }
    }
    return maxElement
}
