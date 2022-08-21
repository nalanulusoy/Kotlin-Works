package com.example.kotlinworkspace.datastructure.lineer

import java.util.*


/**
 * Created by Nalan Ulusoy on 21,Ağustos,2022
 */
/*
Queues use FIFO or first in, first out ordering, meaning the first element that was added will always be the first one removed.
Queues are handy when you need to maintain the order of your elements to process later.
 This data structure similar to real Queues.
 */

/*Insert add(e) offer(e)
Remove remove() poll()
Examine element() peek()*/

/*interface Queue<T> {
    fun enqueue(element: T): Boolean
    fun dequeue(): T?
    val count: Int
        get
    val isEmpty: Boolean
        get() = count == 0
        }
 */

fun main() {
    val queueCity : Queue<String> =  LinkedList<String>()

    queueCity.apply {
        add("NewYork")
        add("Amsterdam")
        add("Tokyo")
        add("Berlin")
        add("Viyana")
        add("Budapeşte")
    }
    println(queueCity)
    queueCity.remove("Tokyo")
    println(queueCity)
    println("Peek: ${queueCity.peek()}") // return first item
    println("Poll: ${queueCity.poll()}") //remove first item
    println(queueCity) // [Amsterdam, Berlin, Viyana, Budapeşte]
}
