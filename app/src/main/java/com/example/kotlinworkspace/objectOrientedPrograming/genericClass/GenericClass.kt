package com.example.kotlinworkspace.objectOrientedPrograming.genericClass

fun main(args:Array<String>){
    Building(Wood())
        .build()
    isSmallBuilding(Building(Brick()))
}

open class BaseBuildingMaterial(numberNeeded:Int=1){
    //
    open val numberNeeded = 1
}


 class Wood :
     BaseBuildingMaterial(){
     //SubClasses
     override val numberNeeded = 3
}
 class Brick:
     BaseBuildingMaterial(){
     //SubClases

    override val numberNeeded = 4
}


class Building<T: BaseBuildingMaterial>(val buildingMaterial: T) {
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        println(" $actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }
}

fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("Small building")
    else println("large building")
}
