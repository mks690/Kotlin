fun printNumber(n: Int): List<Int> {
    if (n <= 0) {
        return emptyList()
    }

    val result = mutableListOf<Int>()
    for (i in n downTo 1) {
        result.add(i)
    }
    return result
}

fun main() {
    println(printNumber(10))
    println(printNumber(5))
    println(printNumber(0))
}
