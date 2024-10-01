fun main() {
    println("Введите 5 чисел")
    val arr1 = IntArray(5){
        readln().toInt()
    }

    println("Введите снова 5 чисел")
    val arr2 = IntArray(5){
        readln().toInt()
    }

    val nArray = arr1 + arr2

    println("Объединенный массив: ${nArray.contentToString()}")
}