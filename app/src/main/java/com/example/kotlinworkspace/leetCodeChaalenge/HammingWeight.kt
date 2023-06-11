package com.example.kotlinworkspace.leetCodeChaalenge


/**
 * Created by Nalan Ulusoy on 11,Haziran,2023
 */
//O(1) < O(log n) < O(k) < O(n) < O(n^n)
fun main(args: Array<String>) {
    println(hammingWeight(12345))
}

// Complexity /O(log n)
fun hammingWeight(n: Int): Int {
    var count = 0
    var num = n

    while (num != 0) {
        count += num and 1
        num = num ushr 1
    }

    return count
}

// Complexity O(1)
fun hammingWeight2(n: Int): Int {
    return Integer.bitCount(n)
}
// Complexity O(k)
fun hammingWeight3(n: Int): Int {
    var count = 0
    var num = n

    while (num != 0) {
        num = num and (num - 1)
        count++
    }

    return count
}
