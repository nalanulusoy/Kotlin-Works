package com.example.kotlinworkspace.sorting


/**
 * Created by Nalan Ulusoy on 14,Ağustos,2022
 */
//O(n) complexity  avarage worst case O(n) best case O(1) if first element match ***
fun linearSearch(list:List<Any>, key:Any):Int?{
    for ((index, value) in list.withIndex()) {
        if (value == key){
            return index
        }
    }
    return null
}

fun main(args: Array<String>) {
    val array = arrayListOf<Int>(1, 15, 13, 63, 34, 21, 8, 9, 3, 4)
    linearSearch(array, 63)
}