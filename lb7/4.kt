fun main() {
    val n = listOf(34,43,12,45,99,21,12,3,56)
    val smaNumb = findSmallestNumber(n)
    println("Маленькое число: $smaNumb")
}

fun findSmallestNumber(numberList: List<Int>): Int {
    return numberList.minOrNull() ?: 0
}
