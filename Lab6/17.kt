import kotlin.random.Random

fun main() {
    val arr = Array(10) { Random.nextInt(1, 8) }

    println("Массив: ${arr.joinToString(" ")}")

    var pr = arr[0]
    for (i in 1 until arr.size) {
        pr *= arr[i]
    }
    println("Произведение всех элементов: $pr")
}