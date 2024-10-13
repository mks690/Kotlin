import kotlin.random.Random

fun main() {

    print("Введите длину пароля: ")
    val passwordLength = readln().toInt()

    val password = generatePassword(passwordLength)
    println("Сгенерированный пароль: $password")
}

fun generatePassword(length: Int): String {
    val charPool = ('a'..'z') + ('A'..'Z') + ('0'..'9') + listOf('!', '@', '#', '$', '%', '^', '&', '*', '(', ')')
    return (1..length)
        .map { charPool.random() }
        .joinToString("")
}
