fun main() {
    var num: Int
    do {
        print("Введите двузначное число: ")
        num = readln().toInt()
    } while (num !in 10..99)
    println("\n\n\tВаше число - $num\n\tа)${num / 10}\t\t\tб)${num % 10}\n\tв)${num / 10 + num % 10}\t\tг)${(num / 10) * (num % 10)}")
}