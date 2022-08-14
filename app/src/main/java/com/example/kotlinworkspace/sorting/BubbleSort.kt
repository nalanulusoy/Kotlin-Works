package com.example.kotlinworkspace.sorting

import java.util.ArrayList


/**
 * Created by Nalan Ulusoy on 14,Ağustos,2022
 */

//best case O(n^2) ,O(n ^ 2) avarage worst case O(n ^ 2)  quadratic
fun bubbleSort(arr:ArrayList<Int>):ArrayList<Int>{
    var swap = true
    while(swap){
        swap = false
        for(i in 0 until arr.size-1){
            if(arr[i] > arr[i+1]){
                val temp = arr[i]
                arr[i] = arr[i+1]
                arr[i + 1] = temp

                swap = true
            }
        }
    }
    return arr
}

/*fun <T : Comparable<T>> ArrayList<T>.bubbleSort(showPasses: Boolean = false) {
// 1
    if (this.size < 2) return
// 2
    for (end in (1 until this.size).reversed()) {
        var swapped = false
        // 3
        for (current in 0 until end) {
            if (this[current] > this[current + 1]) {
                // 4
                this.swapAt(current, current + 1)
                swapped = true
            }
        }
// 5
        if(showPasses) println(this)
        // 6
        if (!swapped) return
    } }

fun <T> ArrayList<T>.swapAt(first: Int, second: Int) { val aux = this[first]
    this[first] = this[second]
    this[second] = aux
}*/


fun main(args: Array<String>) {
    val array = arrayListOf<Int>(1, 15, 13, 63, 34, 21, 8, 9, 3, 4)
    println(bubbleSort(array))
}