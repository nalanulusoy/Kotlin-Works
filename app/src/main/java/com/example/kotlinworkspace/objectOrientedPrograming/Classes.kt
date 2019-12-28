package com.example.kotlinworkspace.objectOrientedPrograming


fun main(args:Array<String>){
    /*var simple= SimpleSpice("curry","mild",5)
    println(simple.spiceName )
    println(simple.spiciness )
    println(simple.heat)*/

    val spices1 = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )
val spice =
    Spice("cayenne", spiciness = "spicy")
    println("${spice.heat} ${spice.name} ${spice.spiciness}")
    val spicelist = spices1.filter {it.heat < 5}
     spicelist.forEach { it-> println("${it.heat}${it.name}${it.spiciness}"  ) }
    fun makeSalt() = Spice("Salt")
    print(makeSalt().heat)
    print(makeSalt().name)
    print(makeSalt().spiciness)
}


class SimpleSpice{

  public lateinit var spiceName:String

  public lateinit var  spiciness:String
    public var heat:Int = 0

    constructor(spiceName: String, spiciness: String, heat: Int) {
        this.spiceName = spiceName
        this.spiciness = spiciness
        this.heat = heat
    }

}



class Spice(val name: String, val spiciness: String = "mild") {

    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }
}





