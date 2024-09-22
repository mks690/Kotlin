import kotlin.random.Random

fun main() {
    val rand = Random.nextInt(1, 101) // Загадали число от 1 до 100
    var guess: Int?
    var attempts = 0

    println("Угадайте число от 1 до 100!")

    do {
        println("Введите ваше число:")
        guess = readLine()?.toInt() // Считываем ввод и пробуем преобразовать в Int
        attempts++

        when {
            guess == null -> println("Введите целое число!!!")
            guess < rand -> println("Слишком маленькое число! Попробуйте снова.")
            guess > rand -> println("Слишком большое число! Попробуйте снова.")
            else -> {
                Thread.sleep(1_500)
                println("\n\nПоздравляю! Вы угадали число $rand за $attempts попыток!")
            }
        }
    } while (guess != rand)
}