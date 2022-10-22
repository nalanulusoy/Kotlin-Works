package com.example.kotlinworkspace.hackerrank


/**
 * Created by Nalan Ulusoy on 21,Ekim,2022
 */
//Hacker Rank Sales Match
/* There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
*/
fun main(){
 val value =  sockMerchant(9, arrayOf(10, 20 ,20 ,10, 10 ,30, 50 ,10 ,20,20,20,10,10))
    println(value)
}

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var count = 0

     ar.groupingBy { it }.eachCount().filter { it.value > 1 }.entries.forEach {
         count += it.value / 2
    }
    return count
}




