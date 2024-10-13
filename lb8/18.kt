fun main() {

    print("Введите число: ")
    val num = readln().toInt()

    if (isPrime(num)) {
        println("Число $num является простым")
    } else {
        println("Число $num не является простым")
    }
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) {
        return false
    }
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}
