import kotlin.random.Random

fun main() {
    val n = Array(25) { Random.nextInt(10, 80) }

    for (i in n.indices) {
        print(n[i])
        if ((i + 1) % 5 == 0) {
            println()
        } else {
            print("\t")
        }
    }
}
