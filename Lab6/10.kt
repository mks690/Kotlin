import kotlin.random.Random

fun main() {
    val numb = IntArray(10) { Random.nextInt(10, 80) }

    var ch = 0

    for (n in numb) {
        if (n % 2 == 0) {
            ch += n
        }
    }
    println("Массив: ${numb.contentToString()}")
    println("Сумма четных чисел: $ch")
}