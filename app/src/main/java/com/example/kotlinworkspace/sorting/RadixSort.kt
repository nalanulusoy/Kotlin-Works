package com.example.kotlinworkspace.sorting

import kotlin.math.pow


/**
 * Created by Nalan Ulusoy on 17,Ağustos,2022
 */
//Complexity O(nk)  best time complexity O(nk) worst time complexity O(nk)
fun IntArray.radixSort(): IntArray {
    var result = this
    val max = getMax()

    var place = 1
    while (max / place > 0) {
        result = result.countingSort(place)
        place *= 10
    }

    return result
}

fun IntArray.countingSort(place: Int): IntArray {
    val result = IntArray(size)
    val count = IntArray(10)

    for (i in 0 until result.size) {
        val digit = (this[i] / place) % 10
        count[digit] += 1
    }

    for (i in 1 until count.size) {
        count[i] += count[i - 1]
    }

    for (i in size - 1 downTo 0) {
        val digit = (this[i] / place) % 10
        result[count[digit] - 1] = this[i]
        count[digit]--
    }

    return result
}

fun IntArray.getMax(): Int {
    var mx = this[0]
    for (i in 1..size - 1)
        if (this[i] > mx)
            mx = this[i]
    return mx
}

fun main(args: Array<String>) {
    val list = (0..10).map { (Math.random() * 10000).toInt() }.toMutableList()
    println("Original: $list")
    val newList = list.toIntArray().radixSort()
    println("Radix sorted: ${newList.toList()}")
}