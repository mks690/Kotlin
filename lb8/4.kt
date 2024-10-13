fun main() {

    val prob = 0.1
    val prize = 1000.0
    val pay = 50.0
    val result = isWorthIt(prob, prize, pay)
    println("Probability: $prob, Prize: $prize, Pay: $pay, Worth it? $result")

}

fun isWorthIt(prob: Double, prize: Double, pay: Double): Boolean {
    return prob * prize > pay
}
