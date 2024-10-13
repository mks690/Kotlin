fun main() {

    print("Введите N: ")
    val n = readln().toInt()

    val array = createArrayFromOneToN(n)
    println("Массив от 1 до $n: ${array.contentToString()}")
}

fun createArrayFromOneToN(n: Int): Array<Int> {
    return Array(n) { i -> i + 1 }
}
