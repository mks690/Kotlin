fun main() {

    print("Введите температуру в градусах Цельсия: ")
    val celsiusTemp = readln().toDouble()

    val fahrenheitTemp = celsiusToFahrenheit(celsiusTemp)
    println("$celsiusTemp°C = $fahrenheitTemp°F")
}

fun celsiusToFahrenheit(celsius: Double): Double {
    return (celsius * 9.0 / 5.0) + 32.0
}
