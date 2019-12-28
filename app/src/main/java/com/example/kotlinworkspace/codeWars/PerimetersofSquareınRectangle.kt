package com.example.kotlinworkspace.codeWars

import java.math.BigInteger
import java.util.stream.StreamSupport.stream

fun main(args:Array<String>){
println(fibonacci(120000000000000000))
}



fun fibonacci(n:Long): BigInteger {
    val n = BigInteger.valueOf(n)
    var t1 :BigInteger= BigInteger.ZERO
    var t2 = BigInteger.ONE
    var sum:BigInteger =BigInteger.ONE
    while (t1 <= n) {
         sum= t1 + t2
        t1 = t2
        t2 = sum
    }
    return sum
}


