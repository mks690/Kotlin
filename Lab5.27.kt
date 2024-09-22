fun main(){
    println("Введите N:")
    var n = readlnOrNull()?.toInt()
    for (a in 1..n!!) println("$a\t".repeat(a))
}