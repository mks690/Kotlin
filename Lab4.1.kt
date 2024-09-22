fun getDayOfWeek(dayNumber: Int, arr: Array<String>): String {
    return when (dayNumber % 7) {
        in 0..6 -> arr[dayNumber % 7]
        else -> "Неверный день"
    }
}

fun main() {
    val dayNumber = readln().toInt()
    var days = arrayOf("Воскресенье", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота")
    println(getDayOfWeek(dayNumber, days))
}