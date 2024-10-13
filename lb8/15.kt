fun main() {

    val num1 = 15
    val num2 = 25
    val maxNumber = findMaxNumber(num1, num2)
    println("Максимальное число из $num1 и $num2 - это $maxNumber")

}

fun findMaxNumber(a: Int, b: Int): Int {
    return if (a > b) a else b
}
