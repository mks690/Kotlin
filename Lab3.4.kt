fun main() {
    var a = readln().toInt()
    var b = readln().toInt()
    if (a % b == 0) print("Числа кратные")
    else print("Остаток от деления = ${a % b}")
}