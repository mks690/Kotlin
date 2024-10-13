fun main() {

    print("Введите число N: ")
    val n = readln().toInt()

    val primes = findPrimes(n)
    println("Простые числа до $n:")
    primes.forEach { println(it) }
}

fun findPrimes(n: Int): List<Int> {
    val primes = mutableListOf<Int>()

    for (i in 2..n) {
        if (isPrime(i)) {
            primes.add(i)
        }
    }

    return primes
}

fun isPrime(n: Int): Boolean {
    if (n < 2) {
        return false
    }

    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0) {
            return false
        }
    }

    return true
}
