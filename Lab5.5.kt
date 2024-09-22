fun main() {
    println("Введите число:")
    val input = readLine()

    val number = input?.toIntOrNull()

    if (number != null) {
        if (prime(number)) {
            println("$number является простым числом.")
        } else {
            println("$number не является простым числом.")
        }
    } else {
        println("Пожалуйста, введите корректное число.")
    }
}


fun prime(num: Int): Boolean {
    if (num <= 1) return false
    if (num == 2) return true
    if (num % 2 == 0) return false


    for (i in 3..Math.sqrt(num.toDouble()).toInt() step 2) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}