package com.example.kotlinworkspace.datastructure.lineer

import java.util.*


/**
 * Created by Nalan Ulusoy on 21,Ağustos,2022
 */
/*Android uses the fragment stack to push and pop fragments
 into and out of an Activity.
 This means that you can only add or remove elements from one side of the data structure.
 In computer science, a stack is known as the LIFO (last-in first-out) data structure.
 Elements that are pushed in last are the first ones to be popped out.
 • push: Adding an element to the top of the stack.
 • pop: Removing the top element of the stack.
 */

/*interface Stack<Element> {
    fun push(element: Element)
    fun pop(): Element?
}*/

fun main(){
   val stackCity : Stack<String> = Stack<String>()
    stackCity.push("London")
    stackCity.push("Edinburg")
    stackCity.push("Dublin")
    stackCity.push("Viyana")
    stackCity.push("Budapeşte")
    stackCity.push("Toronto")
    stackCity.push("Montreal")
    stackCity.push("Berlin")
    stackCity.pop() // remove last item "Berlin"
    println(stackCity)
    println( "Search: "+ stackCity.search("Toronto")) //Search: 2
    println( "Search: "+ stackCity.search("London")) //Search: 7
    println( "Peek: "+ stackCity.peek()) // Peek: Montreal
}
