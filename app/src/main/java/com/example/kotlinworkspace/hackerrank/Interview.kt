package com.example.kotlinworkspace.hackerrank

import java.util.*


/**
 * Created by Nalan Ulusoy on 26,Ekim,2022
 */


fun main(args: Array<String>) {
    var sum = 0
    val `in` = Scanner(System.`in`)
    val n = `in`.nextInt()
    var i = n
    while (n >= 3) {
        if (n % 3 == 0 || n % 5 == 0) {
            sum += sum
        }
        i--
    }
    println(sum)
}
fun sumSquare(n: Int): Int {
    var count = 0;
    var i: Long = 1
    while (i * i <= n) {
        var j: Long = 1
        while (j * j <= n) {
            if (i * i + j * j == n.toLong()) {
                count += 1

            }
            j++
        }
        i++
    }
    return count
}