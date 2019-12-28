package com.example.kotlinworkspace.codeWars

fun main(args:Array<String>){
  sumParts2(intArrayOf(1, 2, 3, 4, 5, 6)).forEach { print(it) }
}



fun sumParts(ls: IntArray): IntArray {
    var s = ls.sum()
    val l = mutableListOf(s)
    ls.forEach { s -= it; l.add(s) }
    return l.toIntArray()
}

fun sumParts2(ls: IntArray): IntArray = ls.run {
    var sumOfAll = sum()
    val result = mutableListOf<Int>()
    forEach {
        result += sumOfAll
        sumOfAll -= it
    }
    (result + 0).toIntArray()
}



fun sumParts3(ls: IntArray): IntArray {
    // your code
    val sums = IntArray(ls.size + 1)
    var sum = 0;
    for(i in (ls.size - 1) downTo 0){
        sum += ls[i]
        sums[i] = sum
    }
    return sums
}


fun sumParts4(ls: IntArray): IntArray {
    var i = ls.size
    val out = IntArray(i + 1)
    while (--i >= 0)
        out[i] = out[i + 1] + ls[i]

    return out
}