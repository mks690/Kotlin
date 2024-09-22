fun main() {
    println("Введите количество чисел (N):")
    val n = readLine()!!.toInt()
    val numbers = mutableListOf<Int>()
    println("Введите $n чисел, разделяя их пробелами:")
    val input = readLine()!!
    numbers.addAll(input.split(" ").map { it.toInt() })
    numbers.sort()

    // Выводим отсортированные числа
    println("Числа в порядке возрастания:")
    println(numbers.joinToString(", "))
}