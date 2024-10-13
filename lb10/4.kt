fun fizzBuzz(n: Int): List<Any> {
    val result = mutableListOf<Any>()
    for (i in 1..n) {
        when {
            i % 15 == 0 -> result.add("ВизллБизлл")
            i % 3 == 0 -> result.add("Физллл")
            i % 5 == 0 -> result.add("Бизлллл")
            else -> result.add(i)
        }
    }
    return result
}

fun main() {
    println(fizzBuzz(10))
    println(fizzBuzz(12))
}
