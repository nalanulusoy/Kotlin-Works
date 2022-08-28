package com.example.kotlinworkspace.datastructure.lineer.collections

import java.lang.reflect.Array.set


/**
 * Created by Nalan Ulusoy on 21,Ağustos,2022
 */
/*Collection

Iterators can be obtained for inheritors of the Iterable<T> interface,
 including Set and List, by calling the iterator() function.

* */
fun main() {
    /*val arrayList = arrayListOf("Pop", 2, true, "Jazz")
    val list = listOf("Rock", 2, "Slow", true) // not writable only readable
    val mutableList = mutableListOf("Pop", "Jazz", 3)
    val intArray = IntArray(size = 3) {
        2
    }
    val array = arrayOf("Rap",2,"Pop")

    arrayList.add("Rock")
    arrayList.add("Folk")
    println("arrayList:"+arrayList) //arrayList:[Pop, 2, true, Jazz, Rock, Folk]

    println("list:"+list) //list:[Rock, 2, Slow, true]

    mutableList.add(1,"Rock")
    mutableList.add(2,"Punk")
    println("mutableList:"+mutableList) //mutableList:[Pop, Rock, Punk, Jazz, 3]

    intArray[2] = 10
    intArray[1] = 5
    println("intArray:"+intArray.toList()) //intArray:[2, 5, 10]

    array.set(1,"Jazz")
    array.set(2,"Punk") // can not set without item because size static
    println("Array:"+array.toList()) //Array:[Rap, Jazz, Punk]

    for (i in list){
        println(i)
    }


    val numbers = listOf("one", "two", "three", "four")
    val numbersIterator = numbers.iterator()
    while (numbersIterator.hasNext()) {
        println(numbersIterator.next())
    }

    val numbers2 = listOf("one", "two", "three", "four")
    val listIterator = numbers2.listIterator()
    while (listIterator.hasNext()) listIterator.next()
    println("Iterating backwards:")
    while (listIterator.hasPrevious()) {
        print("Index: ${listIterator.previousIndex()}")
        println(", value: ${listIterator.previous()}")
    }

    val numbers3 = listOf("one", "two", "three", "four")
    val numbersSequence = numbers3.asSequence()

    println("Number Sequence :${numbersSequence.toList()}")

    val words = "The quick brown fox jumps over the lazy dog".split(" ")
    val lengthsList = words.filter { println("filter: $it"); it.length > 3 }
        .map { println("length: ${it.length}"); it.length }
        .take(4)

    println("Lengths of first 4 words longer than 3 chars:")
    println(lengthsList)*/


    //matrix 3*3
    val arr = mutableListOf(mutableListOf(1, 2, 3, 4),
        mutableListOf(5, 6, 7, 8),
        mutableListOf(9, 10, 11, 12))
    println(arr)
    println(arr[2][3])
    println(arr[0][0])

    //matrix 3*5
    val arr2 = mutableListOf(mutableListOf(1, 2, 3, 4, 5),
        mutableListOf(5, 6, 7, 8, 5),
        mutableListOf(9, 10, 11, 12, 5))
    println(arr2)
    println(arr2[2][3])
    println(arr2[0][0])
    println(arr2[2][4])

    val rows = 2
    val columns = 3
    val firstMatrix = arrayOf(intArrayOf(2, 3, 4), intArrayOf(5, 2, 3))
    val secondMatrix = arrayOf(intArrayOf(-4, 5, 3), intArrayOf(5, 6, 3))

    // Adding Two matrices
    val sum = Array(rows) { IntArray(columns) }
    for (i in 0 until rows) {
        for (j in 0 until columns) {
            sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j]
        }
    }

    // Displaying the result
    println("Sum of two matrices is: ")
    for (row in sum) {
        for (column in row) {
            print("$column    ")
        }
        println()
    }
}

