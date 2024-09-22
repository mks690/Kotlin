import kotlin.math.max
import kotlin.math.min

fun main(){
    var kms = readln().toDouble()
    var foot = readln().toDouble()
    if(kms < (foot * 0.000305)) println("$kms - Большее расстояние")
    else if((foot * 0.000305) < kms) println("$foot - Меньшее расстояние")
}