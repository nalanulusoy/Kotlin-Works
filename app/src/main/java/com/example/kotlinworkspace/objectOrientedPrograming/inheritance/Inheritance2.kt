package com.example.kotlinworkspace.objectOrientedPrograming.inheritance


open class Book(val title: String, val author: String, var pages:Int) {

    private var currentPage = 1


    open fun readPage() {
        currentPage++
    }
}

class eBook(title: String, author: String, var format: String = "text") : Book(title, author,1200) {

    private var wordsRead = 0

    override fun readPage() {
        wordsRead = wordsRead + 250
    }
}


fun main(args:Array<String>){

}