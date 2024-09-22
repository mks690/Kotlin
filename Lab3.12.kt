fun main(){
    print("Введите двузначное число: ")
    val a = readln().toInt()
    var first = a / 10
    var second = a % 10
    if (first > second) print("Первое число больше")
    else if (second > first) print("Второе число больше")
    else if (second == first) print("Числа одинаковы")
}