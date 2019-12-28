package com.example.kotlinworkspace.codeWars

fun main(args:Array<String>){

    println(sumConsecutives(listOf(1,4,4,4,0,4,3,3,1)))
}



fun sumConsecutives(s: List<Int>) = mutableListOf(s[0]).apply {
    (1..s.lastIndex).forEach { if (s[it] == s[it - 1]) this[lastIndex] += s[it] else add(s[it]) }
}


fun sumConsecutives2(s: List<Int>): List<Int> {
    val result = mutableListOf(s[0])
    for (i in 1 until s.size)
        if (s[i] == s[i-1])
            result[result.lastIndex] += s[i]
        else result.add(s[i])
    return result
}



fun sumConsecutives3(input: List<Int>) = input
    .zipWithNext()
    .fold(mutableListOf(input[0]), { collector, value ->
        if (value.first == value.second) {
            collector[collector.lastIndex] += value.first
        } else {
            collector.add(value.second)
        }
        collector
    })


fun sumConsecutives4(s: List<Int>): List<Int> {
    return if (s.size <= 1) s else sumConsecutives(s.dropLastWhile { it == s.last() }) + s.takeLastWhile { it == s.last() }.sum()
}


fun sumConsecutives5(s: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    var tmpSum = 0

    for ((i, n) in s.withIndex()) {
        if (n.equals(s.getOrNull(i+1))) {
            tmpSum = tmpSum + n;
        } else {
            result.add(tmpSum + n)
            tmpSum = 0
        }
    }

    return result
}








