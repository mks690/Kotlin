fun main() {
    var a = readln().toInt()
    var b = readln().toInt()
    if (b % a == 0) println("Число $a является делителем $b")
    println(b % a)
}