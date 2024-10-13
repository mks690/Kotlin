fun main() {

    print("Введите N: ")
    val n = readln().toInt()

    val sum = sumFromOneToN(n)
    println("Сумма чисел от 1 до $n: $sum")
}

fun sumFromOneToN(n: Int): Int {
    return (n * (n + 1)) / 2
}
