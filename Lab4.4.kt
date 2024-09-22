import java.time.LocalTime

fun getTimeOfDay(hour: Int, min:Int): String {
    return when {
        (hour in 6..11 && min in 0..59) -> "Утро"
        (hour in 11..17 && min in 0..59) -> "День"
        (hour in 18..23 && min in 0..59) -> "Вечер"
        (hour in 0..5 && min in 0..59) -> "Ночь"
        else -> "Непраильно введены данные"
    }
}

fun main() {
    println("Введите час:")
    var hour = readln().toInt()
    if (hour == 24) println("Ночь")
    else{
        println("Введите количество минут:")
        var min = readln().toInt()
        println("Текущее время суток: ${getTimeOfDay(hour, min)}")
    }
}