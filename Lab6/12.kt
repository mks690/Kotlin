import kotlin.random.Random

fun main() {
    val arr1 = Array<Int>(10) { Random.nextInt(-25, 25) }
    println("Исходный массив: ${arr1.joinToString(", ")}")

    print("Введите индекс элемента: ")
    val index1 = readln().toInt()
    print("Введите индекс элемента для замены: ")
    val index2 = readln().toInt()

    val temp = arr1[index1]
    arr1[index1] = arr1[index2]
    arr1[index2] = temp

    println("Измененный массив: ${arr1.joinToString(", ")}")
}