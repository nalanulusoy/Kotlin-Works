package com.example.kotlinworkspace.datastructure.nonlineer.graph

import java.util.*
import kotlin.collections.ArrayList


/**
 * Created by Nalan Ulusoy on 21,Ağustos,2022
 */
/* Breadth -First Search,Depth-First Search,Dijkstra's Algorithm,Prim 's Algorithm
What do social networks have in common with booking cheap flights around the world? You can represent both of these real-world models as graphs!

A graph is a data structure that captures relationships between objects.
It’s made up of vertices connected by edges.
 In the graph below, the vertices are represented by circles, and the edges are the lines that connect them.
* */
class Graph(var numberOfNodes: Int = 0, var adjacentList: Hashtable<Int, ArrayList<Int>> = Hashtable()) {
    fun addVertex(node: Int) {
        adjacentList[node] = ArrayList()
        numberOfNodes++
    }

    fun addEdge(node1: Int, node2: Int) {
        adjacentList[node1]?.add(node2)
        adjacentList[node2]?.add(node1)
    }

    fun showConnections() {
        val keys: Array<Any> = adjacentList.keys.toTypedArray()
        for (key in keys) {
            println(key.toString() + " --> " + adjacentList[key.toString().toInt()])
        }
    }
}

fun main() {
    val graph = Graph()
    graph.addVertex(5)
    graph.addVertex(54)
    graph.addVertex(44)
    graph.addEdge(5, 54)
    graph.addEdge(5, 44)
    graph.showConnections()
}
