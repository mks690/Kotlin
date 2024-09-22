fun main() {
    println("Введите 'стоп' для завершения программы.")
    Thread.sleep(1000)
    while (true) {
        println("Введите первую цифру:")
        val firstNumberInput = readLine()
        if (firstNumberInput == "стоп") break
        println("Введите вторую цифру:")
        val secondNumberInput = readLine()
        if (secondNumberInput == "стоп") break
        val firstNumber = firstNumberInput?.toDoubleOrNull()
        val secondNumber = secondNumberInput?.toDoubleOrNull()
        if (firstNumber != null && secondNumber != null) {
            val sum = firstNumber + secondNumber
            val product = firstNumber * secondNumber

            println("Сумма: $sum")
            println("Произведение: $product")
        } else {
            println("Пожалуйста, введите допустимые числа.")
        }
    }
    println("Программа завершена.")
}