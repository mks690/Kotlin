fun main(){
    var a:Long = 0
    do{
        a = readln().toLong()
    } while (a <= 0)
    if ((a % 2).toInt() == 0) print(" Число четное ")
    else print(" Число нечетное ")
    while (a > 10){
        a %= 10
    }
    if( a.toInt() == 7) print("\t\tДа, оканчивается цифрой 7")
}