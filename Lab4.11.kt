import java.util.*

fun main() {
    println("Введите группу крови (A, B, AB, O):")
    val blood = readLine()?.uppercase(Locale.getDefault())

    when (blood) {
        "A" -> println("Для переливания можно использовать: A, O.")
        "B" -> println("Для переливания можно использовать: B, O.")
        "AB" -> println("Для переливания можно использовать: A, B, AB, O.")
        "O" -> println("Для переливания можно использовать: O.")
        else -> println("Некорректная группа крови. Пожалуйста, введите A, B, AB или O.")
    }
}