fun main() {

    val str1 = "Hello"
    val count1 = 2
    val result1 = repeatString(str1, count1)
    println("Строка \"$str1\" повторена $count1 раза: $result1")

    val str2 = "Bye"
    val count2 = 3
    val result2 = repeatString(str2, count2)
    println("Строка \"$str2\" повторена $count2 раза: $result2")

}

fun repeatString(txt: String, n: Int): String {
    if (n <= 0) {
        return ""
    }
    return txt + repeatString(txt, n - 1)
}
