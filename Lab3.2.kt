fun main() {
    val a = readln().toInt()
    val c = readln().toInt()
    val b = readln().toInt()
    var avg:Int = 0
    if((a > b && a < c) || (a > c && a < b)) avg = a
    else if((b > a && b < c) || (b > c && b < a)) avg = b
    else if((c > b && c < a) || (c > a && c < b)) avg = c
    if((a == b) or (b == c) or (a == c)) print("Ошибка")
    else print("$avg - Среднее число")
}