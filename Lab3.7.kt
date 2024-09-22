import kotlin.math.max
import kotlin.math.min

fun main(){
    var a = readln().toFloat()
    var b = readln().toFloat()
    print("${min(a, b)} - Меньшее число, ${max(a, b)} - Большее число")
}