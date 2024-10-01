import kotlin.random.Random

fun main() {
    val arr1 = Array(10) { Random.nextInt(-50, 50) }
    println("Array1: ${arr1.joinToString(" ")}")
    val arr2 = arr1.copyOf()
    println("Array2: ${arr2.joinToString(" ")}")
}