package com.example.kotlinworkspace.sorting


/**
 * Created by Nalan Ulusoy on 14,Ağustos,2022
 */
//insertion sort has an average time complexity of O(n^2) avarage O(n^2)  best case O(n)
//Insertion sort is a more useful algorithm. Like bubble sort and selection sort,
// insertion sort has an average time complexity of O(n2), but the performance of insertion sort can vary.
// The more the data is already sorted, the less work it needs to do.
// Insertion sort has a best time complexity of O(n) if the data is already sorted.

fun insertionSort(items:MutableList<Int>):List<Int>{
    if (items.isEmpty() || items.size<2){
        return items
    }
    for (count in 1..items.count() - 1){
        // println(items)
        val item = items[count]
        var i = count
        while (i>0 && item < items[i - 1]){
            items[i] = items[i - 1]
            i -= 1
        }
        items[i] = item
    }
    return items
}

fun main(args: Array<String>) {
    val array = mutableListOf<Int>(1, 15, 13, 63, 34, 21, 8, 9, 3, 4)
    insertionSort(array)
}