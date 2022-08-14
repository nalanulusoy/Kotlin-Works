package com.example.kotlinworkspace.sorting


/**
 * Created by Nalan Ulusoy on 14,Ağustos,2022
 */
// Complexity avarage O(n^2) worst case O(n^2)
//https://chercher.tech/kotlin/selection-sort-kotlin
//Selection better bubble sort because there is selected number swap bubble all numbers swap
fun selectionSort(sampleArray:IntArray){
    var n=sampleArray.size
    var temp:Int
    for(i in 0..n-1){
        var indexOfMin = i
        for(j in n-1 downTo  i){
            if(sampleArray[j]< sampleArray[indexOfMin])
                indexOfMin=j
        }
        if(i!=indexOfMin){
            temp = sampleArray[i]
            sampleArray[i]= sampleArray[indexOfMin]
            sampleArray[indexOfMin]=temp
        }
    }
}