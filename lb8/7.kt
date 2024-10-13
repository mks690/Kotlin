fun main() {
    println("Проверка на делимость на 100")

    val n1 = 100
    val result1 = isDivisibleBy100(n1)
    println("Число: $n1. Делится на 100? $result1")
}

fun isDivisibleBy100(n: Int): Boolean {
    return n % 100 == 0
}
