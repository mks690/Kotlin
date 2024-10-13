fun main() {
    println("Проверка, является ли число степенью другого числа")

    val (n, k) = 16 to 2
    val result1 = isExponent(n, k)
    println("Является ли $n степенью $k? $result1")

}

fun isExponent(n: Int, k: Int): Boolean {
    if (k == 0) {
        return n == 1
    }

    var result = 1
    for (i in 1..n) {
        result *= k
        if (result == n) {
            return true
        }
        if (result > n) {
            return false
        }
    }

    return false
}
