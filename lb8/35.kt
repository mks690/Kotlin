fun main() {

    print("Введите количество натуральных чисел (N): ")
    val n = readln().toInt()

    val sum = sumOfFirstNNaturalNumbers(n)
    println("Сумма первых $n натуральных чисел: $sum")
}

fun sumOfFirstNNaturalNumbers(n: Int): Int {
    return n * (n + 1) / 2
}
