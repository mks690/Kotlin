import kotlin.random.Random

fun main(){
    val arr = Array<Int>(10, { Random.nextInt(10, 80)})
    println("Массив: ${arr.joinToString(" ")}\nВведите элемент:")
    val n = readln().toInt()
    arr.forEachIndexed{index, element ->
        if (element == n) println("Элемент под индексом $index")
    }

}