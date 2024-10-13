fun main() {

    val num1 = 4
    val num2 = 9

    if (isEven(num1)) {
        println("Число $num1 является четным")
    } else {
        println("Число $num1 является нечетным")
    }

    if (isEven(num2)) {
        println("Число $num2 является четным")
    } else {
        println("Число $num2 является нечетным")
    }
}

fun isEven(num: Int): Boolean {
    return num % 2 == 0
}
