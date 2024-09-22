fun triangle(a: Double, b: Double, c: Double): String {
    if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
        return " Не является треугольником"
    }

    return when {
        a == b && b == c -> "Равносторонний"
        a == b || b == c || a == c -> "Равнобедренный"
        else -> "Разносторонний"
    }
}

fun main() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()

    println(triangle(a, b, c))
}