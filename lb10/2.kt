fun pyramid(n: Int) {
    for (i in 1..n) {
        val spaces = " ".repeat(n - i)
        val hashes = "#".repeat(2 * i - 1)
        println("$spaces$hashes$spaces")
    }
}

fun main() {
    pyramid(1) // '#'
    println()
    pyramid(2) // ' # ', '###'
    println()
    pyramid(3) // ' # ', ' ### ', '#####'
}
