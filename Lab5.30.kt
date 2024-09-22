fun main() {
    println("Введите целое число:")
    val number = readLine()!!.toInt()
    val dv = Integer.toBinaryString(number)
    println("Двоичное представление числа $number: $dv")
}