fun caesarCipher(input: String, shift: Int): String {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val lowercaseAlphabet = alphabet.lowercase()
    var result = ""

    for (char in input) {
        if (char.isUpperCase()) {
            val index = alphabet.indexOf(char)
            val newIndex = (index + shift) % alphabet.length
            result += alphabet[newIndex]
        } else if (char.isLowerCase()) {
            val index = lowercaseAlphabet.indexOf(char)
            val newIndex = (index + shift) % lowercaseAlphabet.length
            result += lowercaseAlphabet[newIndex]
        } else {
            result += char
        }
    }

    return result
}

fun main() {
    println("Введите сообщение для шифрования:")
    val inputMessage = readln()
    println("Введите величину сдвига (от 1 до 25):")
    val shiftValue = readln().toInt()

    val encryptedMessage = caesarCipher(inputMessage, shiftValue)
    println("Зашифрованное сообщение: $encryptedMessage")
}
