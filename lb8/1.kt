fun main() {
    val l1 = listOf(1, 2, 3, 4, 5)

    println("Сумма: ${sumOfList(l1)}")

}

fun sumOfList(list: List<Int>): Int {
    return list.sum()
}
