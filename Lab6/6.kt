fun main() {
    val n = IntArray(10) {(10..80).random()}
    println("Исходный массив: ${n.contentToString()}")

    // Разделяем массив на четные и нечетные числа
    val evenNumbers = n.filter { it % 2 == 0 }.toIntArray()
    val oddNumbers = n.filter { it % 2 != 0 }.toIntArray()

    println("Четные: ${evenNumbers.contentToString()}")
    println("Нечетные: ${oddNumbers.contentToString()}")
}