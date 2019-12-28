package com.example.kotlinworkspace.basic

class Book{
    fun canBorrow(hasBooks: Int): Boolean {
        return (hasBooks < MAX_NUMBER_BOOKS)
    }

    //Singleton is an object-oriented pattern where a class can have only one instance (object).
    object Constants {
        const val BASE_URL = "http://www.turtlecare.net/"
    }
    fun printUrl(title:String) {

        println(Constants.BASE_URL + title + ".html")
    }






    //static
    companion object {
        val BASE_URL = "http://www.turtlecare.net/"
        const val MAX_NUMBER_BOOKS = 20

    }
}
fun main(args:Array<String>){

   //val book= Book()
   // println(book.canBorrow(40))

    //book.printUrl("https://kotlinlang.org/")


    print(highAndLow("-1 1 254"))


}



fun highAndLow(numbers: String): String{
    // ...
    var low:Int=0

    var high:Int=0

    var number = numbers.split(" ").toTypedArray()
    val result = number.map {
        it.toInt()
    }
    high= result.max()!!
    low= result.min()!!



    return "$high $low"
}






