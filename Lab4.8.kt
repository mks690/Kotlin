fun timeToCook(food:String): String{
    return when{
        food == "Макароны" -> "15 мин"
        food == "Гречка" -> "20 мин"
        food == "Свинина" -> "60 мин"
        food == "Рус" -> "20 мин"
        food == "Кукуруза" -> "3 часа"
        else -> "Неверно"
    }
}
fun main(){

    println("""
            1        2       3      4       5       
        [Макароны, Гречка, Свинина, Рис, Кукуруза]
    """.trimIndent())
    print("\nВведите номер пищи, что вы будете готовить: ")
    var num:Int
    do {
        num = readln().toInt()
    }while (num > 5 || num < 1)
    val food:Array<String> = arrayOf("Макароны", "Гречка", "Свинина", "Рис", "Кукуруза")
    println("\n\nВремя готовки для ${food[num-1]}: ${timeToCook(food[num-1])}")
}