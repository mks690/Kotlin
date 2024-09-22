import java.time.LocalDate
import java.time.Month
import java.time.format.DateTimeFormatter

fun main() {
    println("Введите год (например, 2024):")
    val year = readLine()!!.toInt()
    println("Введите месяц (число от 1 до 12):")
    val month = readLine()!!.toInt()
    val monthEnum = Month.of(month)

    println("Даты в $monthEnum $year года:")

    val daysInMonth = monthEnum.length(LocalDate.of(year, monthEnum, 1).isLeapYear)
    for (day in 1..daysInMonth) {
        val date = LocalDate.of(year, monthEnum, day)
        println(date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")))
    }
}