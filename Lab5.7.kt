fun main() {
    val n = readln().toInt()
    var first = 0
    var second = 1

    print("First $n terms: ")

    for (i in 1..n) {
        print("$first ")
        val sum = first + second
        first = second
        second = sum
    }
}