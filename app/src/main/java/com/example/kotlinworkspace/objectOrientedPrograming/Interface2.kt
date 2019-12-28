package com.example.kotlinworkspace.objectOrientedPrograming

abstract class Spices(val name: String, val spiciness: String = "mild") {


abstract fun prepareSpice(spice:String)

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }



}

interface  Grinder{
   fun grind(pow:Double)
}

 open class Curry: Spices("curry","mild"),
     Grinder {



     override fun prepareSpice(spice: String) {

     }

     override fun grind(pow: Double) {

         val mathPow=Math.pow(pow,pow)
         print(mathPow)

     }


 }


interface SpiceColor{

    val color:String

}


object YellowSpiceColor : Curry(){


}

fun main (args:Array<String>){

}