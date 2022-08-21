package com.example.kotlinworkspace.datastructure.nonlineer.trees


/**
 * Created by Nalan Ulusoy on 21,Ağustos,2022
 */
/*
* The tree is a data structure of profound importance.
*  It’s used to tackle many recurring challenges in software development, such as:
• Representing hierarchical relationships.
• Managing sorted data.
• Facilitating fast lookup operations.
 There are many types of trees, and they come in various shapes and sizes.
 * Travel algorithms ,Binary Tree,AVL Trees,Binary Search Trees,Binary Trees
 *
 * */
class TreeNode<T>(val value: T) {
    private val children: MutableList<TreeNode<T>> = mutableListOf()

    fun add(child: TreeNode<T>) = children.add(child)

    override fun toString(): String {
        var s = "${value}"
        if (!children.isEmpty()) {
            s += " {" + children.map { it.toString() } + " }"
        }
        return s
    }
}

fun main() {
    val tree = TreeNode<String>( "Turkey Big Cities")
    val bigCity1 = TreeNode("İstanbul")
    val bigCity2 = TreeNode("Antalya")
    val bigCity3 = TreeNode("Bursa")
    val bigCity4 = TreeNode("Adana")
    val bigCity5 = TreeNode("İzmir")
    println(bigCity1.toString())
    println(bigCity2.toString())
    tree.add(bigCity1)
    tree.add(bigCity2)
    tree.add(bigCity3)
    tree.add(bigCity4)
    tree.add(bigCity5)
    println(tree.toString()) // Turkey Big Cities {[İstanbul, Antalya, Bursa, Adana, İzmir] }
}
