package com.example.kotlinworkspace.leetCodeChaalenge


/**
 * Created by Nalan Ulusoy on 11,Haziran,2023
 */

fun main( args: Array<String>){
    println(romanToInt("MCMXCIV")) // 1994
}

//Complexity O(N)
fun romanToInt(romanNumeral: String): Int {
    val romanSymbols = hashMapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var result = 0
    var prevValue = 0

    for (symbol in romanNumeral) {
        val value = romanSymbols[symbol] ?: 0

        result += if (value > prevValue) {
            value - 2 * prevValue
        } else {
            value
        }

        prevValue = value
    }

    return result
}