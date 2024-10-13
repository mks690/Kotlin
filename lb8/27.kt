fun main() {

    print("Введите элементы массива (через пробел): ")
    val inputArray = readln().split(" ").toTypedArray()

    print("Введите элемент для проверки: ")
    val elementToCheck = readln()

    val contains = containsElement(inputArray, elementToCheck)
    println("Элемент '$elementToCheck' присутствует в массиве? $contains")
}

fun containsElement(arr: Array<Any>, element: Any): Boolean {
    return arr.contains(element)
}
