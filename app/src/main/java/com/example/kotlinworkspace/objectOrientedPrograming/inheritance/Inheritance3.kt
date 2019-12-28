package com.example.kotlinworkspace.objectOrientedPrograming.inheritance

abstract  class AquariumFish{

    //can have constructor
    abstract  val color:String
}


class Shark(override val color: String) : AquariumFish(),
    FishAction {
    override fun eat() {
        println("unch on algae $color")

    }


}

class Plecostomus(override val color: String) : AquariumFish(),
    FishAction {
    override fun eat() {
        println("hunt and eat fish $color ")
    }

}
interface FishAction{

   fun eat()
}

fun main(args:Array<String>){

  val plecostomus=
      Plecostomus("red")
    plecostomus.eat()
    val shark= Shark("blue")
    shark.eat()
}