fun main() {
    val l1 = listOf(1, 2, 3)
    val l2 = listOf(4, 5, 6)

    println("${mergeListsOfIntegers(l1, l2)}")

}

fun mergeListsOfIntegers(l1: List<Int>, l2: List<Int>): List<Int> {
    return l1 + l2
}
