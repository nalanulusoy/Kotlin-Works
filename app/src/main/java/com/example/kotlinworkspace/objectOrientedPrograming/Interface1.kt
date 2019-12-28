package com.example.kotlinworkspace.objectOrientedPrograming

import com.example.kotlinworkspace.objectOrientedPrograming.inheritance.FishAction

fun main (args: Array<String>) {
    delegate()
}

fun delegate() {
    val pleco = Plecostomu()
    println("Fish has has color ${pleco.color}")
    pleco.eat()
}

interface FishActions {
    fun eat()
}

interface FishColor {
    val color: String
}

object GoldColor : FishColor {
    override val color = "gold"
}

class PrintingFishAction(val food: String) :
    FishAction {
    override fun eat() {
        println(food)
    }
}

class Plecostomu (fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat a lot of algae"),
    FishColor by fishColor

