package com.example.kotlinworkspace.datastructure.lineer.collections

import java.util.*


/**
 * Created by Nalan Ulusoy on 21,Ağustos,2022
 */
/*
A linked list is a collection of values arranged in a linear, unidirectional sequence,dynamic .
A linked list has several theoretical advantages over contiguous storage options
such as the Kotlin Array or ArrayList.
But List has advantage more than linked list.
Especially if we need to find middle value more expensive linked list.
• Constant time insertion and removal from the front of the list.
 */
data class Node<T>(var value: T, var next: Node<T>? = null) {
    override fun toString(): String {
        return if (next != null) {
            "$value -> ${next.toString()}"
        } else {
            "$value"
        }
    }
}
/*
class LinkedList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0
    fun isEmpty(): Boolean {
        return size == 0
    }
    override fun toString(): String {
        if (isEmpty()) {
            return "Empty list"
        } else {
            return head.toString() }
    } }*/

fun main() {
    "creating and linking nodes"
    val node1 = Node(value = 1)
    val node2 = Node(value = 2)
    val node3 = Node(value = 3)
    node1.next = node2
    node2.next = node3
    println(node1) // 1 -> 2 -> 3

    val travelList = LinkedList<String>()
    travelList.push("USA") // add element top
    travelList.push("Canada")
    travelList.pop() // remove first item
    travelList.push("UK")
    travelList.push("Holland")
    travelList.push("Italy")
    travelList.addAll(listOf("Germany,Spain","Japan"))
    travelList.add("South Africa")

    println("Before removing last node: $travelList") //Before removing last node: [Italy, Holland, UK, USA, Germany,Spain, Japan, South Africa]
    travelList.removeAt(2) // remove UK
    println("Before removing last node: $travelList") //Before removing last node: [Italy, Holland, USA, Germany,Spain, Japan, South Africa]
    val removedValue = travelList.removeLast()
    println("After removing last node: $travelList") // After removing last node: [Italy, Holland, USA, Germany,Spain, Japan]
    println("Removed value: $removedValue") //Removed value: South Africa

}