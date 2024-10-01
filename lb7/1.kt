fun main() {
    println("Консольный калькулятор!")

    while (true) {
        print("Первое число: ")
        val n1 = readln().toDouble()

        print("Введите оператор (+, -, *, /): ")
        val operator = readln()

        print("Второе число: ")
        val n2 = readln().toDouble()

        // Вычисление результата в зависимости от оператора
        val result = when (operator) {
            "+" -> n1 + n2
            "-" -> n1 - n2
            "*" -> n1 * n2
            "/" -> if (n2 != 0.0) n1 / n2 else {
                println("Ошибка: деление на ноль")
                continue
            }
            else -> {
                println("Ошибка: недопустимый оператор")
                continue
            }
        }

        println("Результат: $result")

        print("Продолжить? (да/нет) ")
        val continueInput = readln().lowercase()
        if (continueInput != "да") break
    }
}
