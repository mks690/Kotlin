import kotlin.math.sqrt

fun main() {
    println("Введите нижнюю границу диапазона:")
    val lower = readLine()!!.toInt()
    println("Введите верхнюю границу диапазона:")
    val upper = readLine()!!.toInt()
    println("Простые числа в диапазоне от $lower до $upper:")
    for (number in lower..upper) {
        if (isPrime(number)) {
            println(number)
        }
    }
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2..sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}