fun main() {
    print("Введите элементы массива: ")
    val arr = readLine()!!.split(" ").map { it.toInt() }
    println(arr.joinToString(" "))
}