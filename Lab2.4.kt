import kotlin.math.pow

fun main() {
    print("Введите число: ")
    var a = readln().toDouble()
    print("Введите степень, в которую нужно возвести число: ")
    var b = readln().toInt()
    print("\n\n $a ^ $b = ${a.pow(b)}")
}