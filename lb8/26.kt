fun main() {

    print("Введите элементы массива (через пробел): ")
    val inputArray = readln().split(" ").toTypedArray()

    val lastElement = getLastElement(inputArray)
    println("Последний элемент массива: $lastElement")
}

fun getLastElement(arr: Array<Any>): Any {
    return arr.last()
}
