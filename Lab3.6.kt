fun main(){
    var year = readln().toInt()
    if((year % 4 == 0 && year % 100 != 0)) print("$year - Високосный год \nКоличество дней = 366")
    else print("$year - Не високосный год")
}