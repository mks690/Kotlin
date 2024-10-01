fun main() {
    val n = intArrayOf(1,3,5,7,9,11,13,15,17,19)

    val max = n.maxOrNull()
    val min = n.minOrNull()

    println("Минимальное значение: $min")
    println("Максимальное значение: $max")
}
