fun nationality(c: String):String{
    return when (c) {
        "США" -> """
           
               Национальность: Американец/Американка    
                                                        
            https://ru.wikipedia.org/wiki/Американцы_США
           
            """
        "Россия" -> """
           
               Национальность: Россиянен/Россиянка    
                                                       
               https://ru.wikipedia.org/wiki/Россияне  
          
            """
        "Япония" -> """
           
                   Национальность: Японец/Японка       
                                                       
               https://ru.wikipedia.org/wiki/Японцы    
            
            """
        "Канада" -> """
           
                  Национальность: Канадец/Канадка      
                                                       
               https://ru.wikipedia.org/wiki/Канадцы   
           
            """
        "Франция" -> """
            
              Национальность: Француз/Француженка     
                                                       
               https://ru.wikipedia.org/wiki/Французы  
            
            """

        "Италия" -> """
            
               Национальность: Итальянец/Итальянка     
                                                       
               https://ru.wikipedia.org/wiki/Итальянцы 
            
            """

        else -> "Неизвестная страна. Пожалуйста, введите одну из поддерживаемых стран."
    }
}
fun main() {
    println("Введите страну (США, Россия, Япония и т.д.):")
    val country = readlnOrNull()
    println(country?.let { nationality(it) })

}