package com.example.kotlinworkspace.sorting


/**
 * Created by Nalan Ulusoy on 15,Ağustos,2022
 */
//Best case O(nlogn) avarage O(nlogn) worst case O(nlogn)
// Merge sort is more efficient and works faster than quick sort in case of larger array size or datasets.
// Sorting method : The quick sort is internal sorting method where the data is sorted in main memory.
fun mergeSort(list: List<Int>): List<Int> {
    if (list.size <= 1) {
        return list
    }

    val middle = list.size / 2
    var left = list.subList(0,middle);
    var right = list.subList(middle,list.size);

    return merge(mergeSort(left), mergeSort(right))
}
fun merge(left: List<Int>, right: List<Int>): List<Int>  {
    var indexLeft = 0
    var indexRight = 0
    var newList : MutableList<Int> = mutableListOf()

    while (indexLeft < left.count() && indexRight < right.count()) {
        if (left[indexLeft] <= right[indexRight]) {
            newList.add(left[indexLeft])
            indexLeft++
        } else {
            newList.add(right[indexRight])
            indexRight++
        }
    }

    while (indexLeft < left.size) {
        newList.add(left[indexLeft])
        indexLeft++
    }

    while (indexRight < right.size) {
        newList.add(right[indexRight])
        indexRight++
    }
    return newList;
}

fun main(args: Array<String>) {
    val numbers = mutableListOf(38,27,43,3,9,82,10)
    val sortedList = mergeSort(numbers)
    println("Unsorted: $numbers")
    println("Sorted: $sortedList")
}