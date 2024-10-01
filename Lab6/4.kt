fun main() {
    val n = intArrayOf(34,7,9,45,99,21,11,3,5,89,56)

    println("Исходный массив:")
    printArray(n)

    n.sort()

    println("Отсортированный массив:")
    printArray(n)
}

fun printArray(arr: IntArray) {
    for (numb in arr) {
        print("$numb ")
    }
    println()
}