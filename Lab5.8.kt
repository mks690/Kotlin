fun algorithm(a: Int, b: Int): Int {
    var x = a ;var y = b
    while (y != 0) {val temp = y; y = x % y; x = temp}
    return x
}

fun main() {
    println("Введите первое число:")
    val firstNum = readLine()?.toInt()
    println("Введите второе число:")
    val secondNum = readLine()?.toInt()
    if (firstNum != null && secondNum != null) {
        val result = algorithm(firstNum, secondNum)
        println("Наибольший общий делитель чисел $firstNum и $secondNum равен: $result")
    } else {
        println("Пожалуйста, введите корректные целые числа.")
    }
}