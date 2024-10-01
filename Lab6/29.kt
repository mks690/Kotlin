fun main() {
    println("Введите элементы массива:")
    val input = readln()
    val n = input.trim().split(" ").map { it.toInt() }.toIntArray()

    val mediana = findMedian(n)
    println("Медиана массива: $mediana")
}

fun findMedian(numb: IntArray): Double {
    val sortNum = numb.sortedArray()
    val size = sortNum.size

    return if (size % 2 == 0) {
        (sortNum[size / 2 - 1] + sortNum[size / 2]).toDouble() / 2
    } else {
        sortNum[size / 2].toDouble()
    }
}