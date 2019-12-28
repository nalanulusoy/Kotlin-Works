package com.example.kotlinworkspace.objectOrientedPrograming

import android.graphics.Color

abstract class Spicess(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    abstract fun prepareSpice()
}
class Curryss(name: String, spiciness: String,
            color: SpiceColor = YellowSpiceColorss
) : Spicess(name, spiciness, color),
    Grinderss {
    override fun grind() {
    }

    override fun prepareSpice() {
        grind()
    }
}

interface Grinderss {
    fun grind()
}

interface SpiceColorss {
    val color: String
}

object YellowSpiceColorss : SpiceColor {
    override val color = "Yellow"
}


data class SpiceContainer(val spice: Spice){

    val label:String=spice.name

}
fun main(args:Array<String>){
    val spiceCabinet = listOf(
        SpiceContainer(
            Spice(
                "Red Melon",
                "medium"
            )
        ),
        SpiceContainer(
            Spice(
                "Red Curry",
                "medium"
            )
        ),
        SpiceContainer(
            Spice(
                "Green Curry",
                "spicy"
            )
        )
    )

    for(element in spiceCabinet)
        println(element.label)




    //PAİRS

    val (title, author) = Pair("Masumiyet Müzesi", "Orhan Pamuk")
    println(title)
    println(author)


    val (titles, authors, year) = Triple(listOf("serenad","leylanın evi"), "Zulfu Livaneli",2015)
    println(titles)
    println(authors)
    println(year)



    val book =
        Books(
            "Romeon and Juliet",
            "William Shakespeare",
            1597
        )
    val bookTitleAuthor = book.getTitleAuthor()
    val bookTitleAuthorYear = book.getTitleAuthorYear()

    println("Here is your book ${bookTitleAuthor.first} by ${bookTitleAuthor.second}")

    println("Here is your book ${bookTitleAuthorYear.first} " +
            "by ${bookTitleAuthorYear.second} written in ${bookTitleAuthorYear.third}")

}




class Books(val title: String, val author: String, val year: Int) {

    fun getTitleAuthor(): Pair<String, String> {
        return (title to author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(title, author, year)
    }
}


enum class Colors(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}


interface SpiceColors {
    val color: Color
}


object YellowSpiceColors : SpiceColors {

    override val color: Color
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
}