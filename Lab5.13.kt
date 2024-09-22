fun main(){
    for (a in 1..20){
        print("$a ^ 2 = ${Math.pow(a.toDouble(), 2.0)} \t")
        if(a % 5 == 0) print("\n")
    }
}