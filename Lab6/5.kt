fun main() {
    val numb = intArrayOf(1,3,5,7,9,11,13,15,17,19)
    for (n in numb) {
        print("$n ")
    }
    println()
    println("Уникальные элементы: ${numb.distinct().toString()}")
}