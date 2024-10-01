fun main() {
    val n = intArrayOf(1,2,3,4,5,6,7,8,9,)
    val reversedN = n.copyOf().apply { reverse() }

    println("Исходный массив: ${n.contentToString()}")
    println("Реверсированный массив: ${reversedN.contentToString()}")
}