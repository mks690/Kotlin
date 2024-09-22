fun main() {
    var a = readln().toInt()
    var b = readln().toInt()
    var c = readln().toInt()
    if ((a <= b + c) and (b <= a + c) and (c <= b + a)) print("Треугольник может существовать")
    else println("Треугольник не может существовать")
}