import kotlin.random.Random

fun main() {
    val n = IntArray(10) { Random.nextInt(10, 80) }
    for(n in n) {
        print("$n ")
    }
    println()
    val secondMax = findSecondMax(n)

    when (secondMax) {
        null -> println("Нет элемента")
        else -> println("Второй по величине элемент: $secondMax")
    }
}

fun findSecondMax(arr: IntArray): Int? {
    if (arr.size < 2) return null

    var max1 = arr[0]
    var max2 = arr[1]

    for (num in arr) {
        when {
            num > max1 -> {
                max2 = max1
                max1 = num
            }
            num > max2 && num != max1 -> {
                max2 = num
            }
        }
    }

    return if (max2 != Int.MIN_VALUE) max2 else null
}