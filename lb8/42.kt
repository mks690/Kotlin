fun main() {

    print("Введите элементы массива (через пробел): ")
    val inputArray = readln().split(" ").map { it.toInt() }.toIntArray()

    print("Введите элемент для поиска: ")
    val searchElement = readln().toInt()

    val index = indexOfElement(inputArray, searchElement)

    if (index == -1) {
        println("Элемент $searchElement не найден в массиве")
    } else {
        println("Индекс первого вхождения элемента $searchElement: $index")
    }
}

fun indexOfElement(arr: IntArray, element: Int): Int {
    for (i in arr.indices) {
        if (arr[i] == element) {
            return i
        }
    }
    return -1
}
