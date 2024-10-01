import kotlin.random.Random

fun main() {
    val arr = Array(25) { Random.nextInt(10, 80) }

    println("Массив: ${arr.joinToString(" ")}")

    print("\nЭлемент для поиска: ")
    val n = readln().toInt()
    println(isNumberInArray(n, arr))
}

fun isNumberInArray(number: Int, arr: Array<Int>): Boolean {
    return number in arr
}