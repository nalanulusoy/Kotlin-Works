@file:JvmName("ConditionsKt")

package com.example.kotlinworkspace.basic

import kotlin.random.Random

fun main(args:Array<String>){
    //rightTrianglePattern()
   // makeRectangle(5)
   print(calculateGrade(40))
    print(diceRoll())

}




val calculateGrade = { grade : Int ->
    when(grade) {
        in 0..40 -> "Fail"
        in 41..70 -> "Pass"
        in 71..100 -> "Distinction"
        else -> false
    }
}

val diceRoll={

    var number=Random.nextInt(1,12)
    var number2=Random.nextInt(1,12)
    when{
        number==number2-> "Çift geldi"
        else->"Tekrar dene"

    }



}







fun makeRectangle(n:Int){
        repeat(n){
            repeat(n){
                print("*")
            }
            println("")
        }
}




fun rightTrianglePattern(){
    var n=5
    for (i in n downTo  1){

        for(j in 0 until i){
            print("*")
        }
        println(" ")
    }
}

