fun main() {

    println("Доступные валюты: USD, EUR, RUB")

    print("Введите исходную валюту: ")
    val fromCurrency = readln().uppercase()

    print("Введите количество: ")
    val amount = readln().toDouble()

    print("Введите целевую валюту: ")
    val toCurrency = readln().uppercase()

    val convertedAmount = convert(fromCurrency, toCurrency, amount)

    println("$amount $fromCurrency = $convertedAmount $toCurrency")
}

fun convert(from: String, to: String, amount: Double): Double {
    val exchangeRates = mapOf(
        "USD" to 1.0,
        "EUR" to 0.92,
        "RUB" to 72.5
    )

    if (!exchangeRates.containsKey(from) || !exchangeRates.containsKey(to)) {
        throw IllegalArgumentException("Неверная валюта")
    }

    val fromRate = exchangeRates[from]!!
    val toRate = exchangeRates[to]!!

    return amount * (toRate / fromRate)
}
