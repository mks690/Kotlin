fun main() {
    println("Случайные числа от 1 до 100:")

    for (i in 1..10) {
        val randomNumber = (1..100).random()
        println(randomNumber)
    }
}
