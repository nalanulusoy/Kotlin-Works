package com.example.kotlinworkspace.hackerrank


/**
 * Created by Nalan Ulusoy on 25,Ekim,2022
 */
fun main(){
    println(getMoneySpent(arrayOf(5,1,1), arrayOf(4),5))
}
fun getMoneySpent(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {
    val spending: ArrayList<Int> = arrayListOf()

    for (keyboard in keyboards) {
        for (drive in drives) {
            if ((keyboard + drive) <= b) {
                spending.add((keyboard + drive))
            }
        }
    }
    return if (spending.isEmpty()) {
        -1
    } else {
        spending.max()!!
    }
}