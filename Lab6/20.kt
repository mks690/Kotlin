fun main() {
    val start = 10
    val step = 7
    val size = 15

    val array = Array(size) { index -> start + index * step }
    println("Арифметическая прогрессия: ${array.contentToString()}")
}