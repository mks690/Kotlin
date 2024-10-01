import kotlin.random.Random

fun main() {
    val ran = IntArray(20) { Random.nextInt(1, 101) }

    // Выводим массив на экран
    println("Массив случайных чисел:")
    println(ran.joinToString(" "))
}