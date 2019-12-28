package com.example.kotlinworkspace.objectOrientedPrograming.genericClass

fun main(args:Array<String>){
    genericExample()
}


open class WaterSupply(var needProcessed:Boolean) //SUPER CLASS




class TapWater: WaterSupply(needProcessed = true) { //SUBCLASSES

    fun addCgemicalsCleaners()=apply { needProcessed=false }
}

class FishStoreWater: WaterSupply(needProcessed = false) //SUBCLASSES


class LakeWater: WaterSupply(true){ //SUBCLASSES
    fun filter()=apply { needProcessed=false }
}



//generic Function
fun <T:WaterSupply> isWaterClean(aquarium: Aquarium<T>){
    println("aquarium water is clean:${aquarium.waterSupply.needProcessed}")
}



class Aquarium< out T: WaterSupply>(val waterSupply: T){ //GENERİC CLASSES
    fun addWater(cleaner: Cleaner<T>){
      if(waterSupply.needProcessed){
          cleaner.clean(waterSupply)
      }
        println("adding water from $waterSupply")
    }
}

interface  Cleaner<in T: WaterSupply>{
    fun clean(waterSupply:T)
}
class TapWaterCleaner:
    Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) {
        waterSupply.addCgemicalsCleaners()

    }
}

fun addItemTo(aquarium: Aquarium<WaterSupply>)=print("item added")
fun genericExample(){

     val aquarium=
         Aquarium(TapWater())
    addItemTo(aquarium)
    isWaterClean(aquarium)
}




//Generic Class in ve out  generic modifier eger generic class output amacıyla kullanıyorsak out input amacıyla kullanıyorsak in


