fun main() {

    val expr1 = "1+1"
    val result1 = evaluateExpression(expr1)
    println("Результат выражения \"$expr1\" = $result1")

    val expr2 = "5-3"
    val result2 = evaluateExpression(expr2)
    println("Результат выражения \"$expr2\" = $result2")
}

fun evaluateExpression(expression: String): Int {
    val parts = expression.split("+", "-", "*", "/")
    val operators = expression.filter { it in listOf('+', '-', '*', '/') }

    var result = parts.first().toInt()

    for (i in operators.indices) {
        val op = operators[i]
        val num = parts[i + 1].toInt()

        when (op) {
            '+' -> result += num
            '-' -> result -= num
            '*' -> result *= num
            '/' -> result /= num
        }
    }

    return result
}
