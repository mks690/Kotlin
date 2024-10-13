fun main() {

    val n1 = 3
    val result1 = generateGoogleString(n1)
    println("Строка Google с $n1 буквами 'o': $result1")

    val n2 = 5
    val result2 = generateGoogleString(n2)
    println("Строка Google с $n2 буквами 'o': $result2")

}

fun generateGoogleString(number: Int): String {
    val googleString = "Google"
    val oCount = number
    return buildString {
        append(googleString.substring(0, 1))
        repeat(oCount) { append("o") }
        append(googleString.substring(1))
    }
}
