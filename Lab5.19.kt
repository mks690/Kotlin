fun main() {
    val numbers = arrayOf(34, 12, 45, 67, 23, 87, 29, 15, 90, 56)
    println("Исходный массив: ${numbers.joinToString(" ")}")
    for (i in numbers.indices) {
        for (j in 0..numbers.size - 2 - i) {
            if (numbers[j] > numbers[j + 1]) {
                val temp = numbers[j]
                numbers[j] = numbers[j + 1]
                numbers[j + 1] = temp
            }
        }
    }

    println("Отсортированный массив: ${numbers.joinToString(", ")}")
}