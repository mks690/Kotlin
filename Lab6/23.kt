fun main() {
    val arr1 = intArrayOf(55, 54, 53)
    val arr2 = intArrayOf(45, 44, 43)
    val arr3 = intArrayOf(35, 34, 33)

    val sarray = intArrayOf(*arr1, *arr2, *arr3)
    println("Объединенный массив: ${sarray.joinToString(" ")}")
}