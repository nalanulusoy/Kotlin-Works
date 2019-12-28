package com.example.kotlinworkspace.objectOrientedPrograming.inheritance

class Example:Any() // bu aynı  class Example cunku kotlinde default superclass Any()

open class Base(p: Int)// super class Base open keyword alır

class Derived(p: Int) : Base(p)// subclass Derived



open class Shape { //Shape SuperClass
    open val vertexCount: Int = 0
    open fun draw() { /*...*/ } // subclass ta override etmek istedigimid function open keyword ekliyoruz
    fun fill() { /*...*/ }
}

class Circle() : Shape() {
    override fun draw() { /*...*/ }
}



class Rectangles : Shape() {

    override val vertexCount = 4
    override fun draw() {
        super.draw()
    }

}


open class Polygons {
    open fun draw() {}
}

abstract class Rectangless : Polygons() { // eger class abstarct ise funcrion abstact olmalı
    override abstract fun draw()
}