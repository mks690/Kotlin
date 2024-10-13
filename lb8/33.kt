fun main() {

    val myArray = intArrayOf(10, 20, 30, 40, 50)

    print("Введите индекс элемента, который хотите найти: ")
    val index = readln().toInt()

    val element = findElementByIndex(myArray, index)
    if (element != null) {
        println("Элемент по индексу $index: $element")
    } else {
        println("Индекс $index находится за пределами массива.")
    }
}

fun findElementByIndex(array: IntArray, index: Int): Int? {
    return if (index >= 0 && index < array.size) {
        array[index]
    } else {
        null
    }
}
