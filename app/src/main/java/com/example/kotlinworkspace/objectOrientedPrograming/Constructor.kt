package com.example.kotlinworkspace.objectOrientedPrograming


class Person(val name: String) {
    var children: MutableList<Person> = mutableListOf<Person>()

    //Secondary Constructor
    constructor(name: String, parent: Person) : this(name) {
        parent.children.add(this)
    }
}

class Constructors {
    init {
        println("Init block")
    }


    //Secondary Constructor
    constructor(i: Int) {
        println("Constructor")
    }
}

//Primary Constructor
class Customer(name: String) {
    val customerKey = name.toUpperCase()

    init{
    println(customerKey)
    }
}