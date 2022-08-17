package com.example.kotlinworkspace.sorting


/**
 * Created by Nalan Ulusoy on 17,Ağustos,2022
 */
////Complexity O((nlog(n))^2)  best time complexity O(n) worst time complexity O(nk)
fun shellSort(a: IntArray): IntArray {
    var increment = a.size / 2
    while (increment > 0) {
        for (i in increment until a.size) {
            val temp = a[i]
            var j = i
            while (j >= increment && a[j - increment] > temp) {
                a[j] = a[j - increment]
                a[j - increment] = temp
                j -= increment
            }
        }
        increment = if (increment == 2) 1 else Math.round(increment / 2.2).toInt()
    }
    return a
}

fun main(args: Array<String>) {
    val list = (0..10).map { (Math.random() * 10000).toInt() }.toMutableList()
    println("Original: $list")
    val newList = shellSort(list.toIntArray()).toList()
    println("Shell sorted: ${newList}")
}