fun main() {

    print("Введите элементы массива (через пробел): ")
    val inputArray = readln().split(" ").map { it.toInt() }.toIntArray()

    val sum = sumArrayElements(inputArray)
    println("Сумма элементов массива: $sum")
}

fun sumArrayElements(arr: IntArray): Int {
    var sum = 0
    for (num in arr) {
        sum += num
    }
    return sum
}
