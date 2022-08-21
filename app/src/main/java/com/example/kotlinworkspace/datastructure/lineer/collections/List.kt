package com.example.kotlinworkspace.datastructure.lineer.collections


/**
 * Created by Nalan Ulusoy on 21,Ağustos,2022
 */
/*Collection

Iterators can be obtained for inheritors of the Iterable<T> interface,
 including Set and List, by calling the iterator() function.

* */
fun main() {
    val arrayList = arrayListOf("Pop", 2, true, "Jazz")
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
    println(lengthsList)
}