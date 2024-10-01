import kotlin.random.Random
fun main() {
    val n = mutableListOf(3,66,13,90,4,76,55,34,23,11,7,89,76)

    println("Элементы: ${n.joinToString(" ")}")

    print("Выберите элемент из списка(индекс): ")
    val index = readln().toInt()

    n.removeAt(index)
    println("Обновленный список: ${n.joinToString(" ")}")
}