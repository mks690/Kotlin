fun main() {
    val n1 = 20
    val n2 = 40

    val areNumbersEqual = areNumbersEqual(n1, n2)
    println("Числа равны: $areNumbersEqual")
}

fun areNumbersEqual(n1: Int, n2: Int): Boolean {
    return n1 == n2
}
