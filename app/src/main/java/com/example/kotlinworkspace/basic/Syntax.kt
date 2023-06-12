package com.example.kotlinworkspace.basic


/**
 * Created by Nalan Ulusoy on 12,Haziran,2023
 */

fun main(args: Array<String>){
    val count = 10
    for (i in count downTo 1 step 2) {
        println(i.toString()  + "i")
    }

    for(i in 1.. count ){
        println(i)
    }
    for(i in  count downTo  3  step 4){
        println(i)
    }

    for (i in 0 .. 10){
        println(i)
    }

    // 3*3 matrix
    val matrix = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )

}