fun chislo(num: Int): String {
    return when {
        num > 0 -> "Положительное число"
        num < 0 -> "Отрицательное число"
        else -> "Ноль"
    }
}

fun main() {
    val number = readln().toInt()
    println("Число $number является: ${chislo(number)}")
}