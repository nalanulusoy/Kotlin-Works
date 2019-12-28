package com.example.kotlinworkspace.basic

import kotlin.random.Random

fun main(args:Array<String>){

    gamePlay(rollDice2(4))

}

fun gamePlay(diceRoll: Int){
    // do something with the dice roll
    println(diceRoll)
}

val rollDice = { sides: Int ->
    Random.nextInt(sides) + 1
}
val rollDice0 = { sides: Int ->
    if (sides == 0) 0
    else Random.nextInt(sides) + 1
}
val rollDice2: (Int) -> Int = { sides ->
    if (sides == 0) 0
    else Random.nextInt(sides) + 1
}