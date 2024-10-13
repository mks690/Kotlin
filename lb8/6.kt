fun main() {
    println("Проверка суммы чисел на меньше 100")

    val n1 = 15
    val n2 = 70
    val result1 = sumLessThan100(n1, n2)
    println("Числа: $n1, $n2. Сумма меньше 100? $result1")

}

fun sumLessThan100(n1: Int, n2: Int): Boolean {
    return (n1 + n2) < 100
}
