fun main() {

    print("Введите число: ")
    val number = readln().toInt()

    printMultiplicationTable(number)
}

fun printMultiplicationTable(number: Int) {
    println("Таблица умножения для числа $number:")
    for (i in 1..10) {
        println("$number x $i = ${number * i}")
    }
    println()
}
