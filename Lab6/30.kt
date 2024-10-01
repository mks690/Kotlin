import kotlin.random.Random

fun main() {
    val arr = Array(100) { Random.nextInt(-10, 80) }

    for (i in arr.indices) {
        print(arr[i])
        if ((i + 1) % 10 == 0) {
            println()
        } else {
            print("\t")
        }
    }
}