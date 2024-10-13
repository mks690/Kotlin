import kotlin.random.Random

fun main() {
    println("Игра \"Угадай число\"")
    println("Загадано число от 1 до 100. Попробуй угадать!")

    val targetNumber = Random.nextInt(1, 101)
    var currentGuess: Int

    while (true) {
        print("Введи свое предположение: ")
        currentGuess = readln().toInt()

        if (currentGuess == targetNumber) {
            println("Поздравляю, ты угадал!")
            break
        } else if (currentGuess < targetNumber) {
            println("Загаданное число больше. Попробуй еще раз.")
        } else {
            println("Загаданное число меньше. Попробуй еще раз.")
        }
    }
}
