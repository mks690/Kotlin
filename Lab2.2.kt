fun main() {
    var num: Int
    do {
        print("Введите трехзначное число: ")
        num = readln().toInt()
    } while (num !in 100..999)
    println("\n\n\tВаше число - $num\n\tа)${num % 10 % 10}\t\t\tб)${num / 10}\n\tв)${num / 10 / 10 + num / 10 % 10 + num % 10 % 10}\t\tг)${(num / 10 / 10) * (num / 10 % 10) * (num % 10 % 10)}")
    }
