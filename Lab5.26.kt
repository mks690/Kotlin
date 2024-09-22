fun main(){
    println("Введите N: ")
    val n = readln().toInt()
    var sumChet:Int = 0; var sumNechet:Int = 0
    for (a in 1..n){
        if (a % 2 == 0) sumChet += a
        else sumNechet += a
    }
    println("Сумма четных = $sumChet\nСумма нечетных = $sumNechet")
}