import kotlin.random.Random

fun main() {
    val arr1 = IntArray(10) { Random.nextInt(1, 11) }
    val arr2 = IntArray(10) { Random.nextInt(1, 11) }

    println("1 Массив: ${arr1.contentToString()}")
    println("2 Массив: ${arr2.contentToString()}")

    val per = arr1.intersect(arr2.toSet()).toIntArray()

    println("Пересечение: ${per.contentToString()}")
}