package com.example.kotlinworkspace.objectOrientedPrograming

import com.example.kotlinworkspace.objectOrientedPrograming.inheritance.Book
import kotlin.random.Random



fun Book.weight() : Double { return (pages * 1.5) }
fun Book.tornPages(torn: Int) = if (pages >= torn) pages -= torn else pages = 0

fun main(args:Array<String>){
    val puppy = Puppy()
    val book = Book(
        "Oliver Twist",
        "Charles Dickens",
        1837
    )

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("${book.pages} left in ${book.title}")
    }
    println("Sad puppy, no more pages in ${book.title}. ")
}


class Puppy {
    fun playWithBook(book: Book) {
        book.tornPages(Random.nextInt(12))
    }
}
