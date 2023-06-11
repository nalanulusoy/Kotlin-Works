package com.example.kotlinworkspace.basic

import kotlin.math.pow


/**
 * Created by Nalan Ulusoy on 11,Haziran,2023
 */
fun main(args:Array<String>){
    val list1 = listOf(1, 2, 3, 4, 5)
    val list2 = listOf(4, 5, 6, 7, 8)

    val commonElements = list1.intersect(list2)

    println("Ortak Elemanlar:")
    for (element in commonElements) {
        println(element)
    }
}



