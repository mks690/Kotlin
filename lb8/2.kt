fun main() {
    val l1 = listOf(5, 2, 9, 1, 7)

    println("${diffMaxMin(l1)}")
}

fun diffMaxMin(list: List<Int>): Int {
    if (list.isEmpty()) {
        return 0
    }

    val max = list.maxOrNull() ?: 0
    val min = list.minOrNull() ?: 0

    return max - min
}
