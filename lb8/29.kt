fun main() {

    print("Введите элементы массива (через пробел): ")
    val inputArray = readln().split(" ").toTypedArray()

    val (min, max) = findMinMax(inputArray)
    println("Минимальное значение: $min")
    println("Максимальное значение: $max")
}

fun findMinMax(arr: Array<Any>): Pair<Any, Any> {
    var min = arr.first()
    var max = arr.first()

    for (i in 1 until arr.size) {
        if (arr[i] < min) {
            min = arr[i]
        }
        if (arr[i] > max) {
            max = arr[i]
        }
    }

    return Pair(min, max)
}
