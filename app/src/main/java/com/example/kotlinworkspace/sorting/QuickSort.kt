package com.example.kotlinworkspace.sorting


/**
 * Created by Nalan Ulusoy on 15,Ağustos,2022
 */
//Best case O(nlogn) avarage O(nlogn) worst case O(n^2)
// Quick sort is more efficient and works faster than merge sort in case of smaller array size or datasets.
fun quickSort(items:List<Int>):List<Int>{
    if (items.count() < 2){
        return items
    }
    val pivot = items[items.count()/2]

    val equal = items.filter { it == pivot }
//    println("pivot value is : "+equal)

    val less = items.filter { it < pivot }
//    println("Lesser values than pivot : "+less)

    val greater = items.filter { it > pivot }
//    println("Greater values than pivot : "+greater)

    return quickSort(less) + equal + quickSort(greater)
}
fun main(args: Array<String>) {
    println(" Original list:")
    val numbers = listOf<Int>(2, 4, 7, 3, 6, 9, 5, 1, 0)
    println(numbers)
    println(" Ordered list:")
    val ordered =  quickSort(numbers)
    println(ordered)
}