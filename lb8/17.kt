fun main() {

    print("Введите число: ")
    val num = readln().toInt()

    val result = factorial(num)
    println("Факториал числа $num равен $result")
}

fun factorial(n: Int): Long {
    if (n == 0 || n == 1) {
        return 1
    } else {
        return n * factorial(n - 1)
    }
}
