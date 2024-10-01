import kotlin.random.Random

fun main() {
    val arr = Array(10) { Random.nextInt(-10, 80) }
    val sr = Average(arr)
    for(n in arr) {
        print("$n ")
    }
    println()
    println("Среднее арифметическое: $sr")
}

fun Average(arr: Array<Int>): Double {
    return if (arr.isEmpty()) 0.0 else arr.sum().toDouble() / arr.size
}