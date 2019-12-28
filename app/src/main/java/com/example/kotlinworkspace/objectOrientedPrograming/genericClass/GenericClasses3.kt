package com.example.kotlinworkspace.objectOrientedPrograming.genericClass

open class Food //super class
open class FastFood : Food() // sub class FastFood super class Food
class Burger : FastFood()   //sub class Burger super class FastFood
interface ProductionConsumer<T> {
    fun produce(): T
    fun consume(item: T)
}

class FoodStore :
    Production<Food> {
    override fun produce(): Food {
        println("Produce food")
        return Food()
    }
}

class FastFoodStore :
    Production<FastFood> {
    override fun produce(): FastFood {
        println("Produce fast food")
        return FastFood()
    }
}

class InOutBurger :
    Production<Burger> {
    override fun produce(): Burger {
        println("Produce burger")
        return Burger()
    }
}
interface Production<out T> {
    fun produce(): T
}

interface Consumer<in T> {
    fun consume(item: T)
}


class Everybody :
    Consumer<Food> {
    override fun consume(item: Food) {
        println("Eat food")
    }
}

class ModernPeople :
    Consumer<FastFood> {
    override fun consume(item: FastFood) {
        println("Eat fast food")
    }
}

class American :
    Consumer<Burger> {
    override fun consume(item: Burger) {
        println("Eat burger")
    }
}

fun main(args:Array<String>){
    val consumer1 : Consumer<Burger> =
        Everybody()
    val consumer2 : Consumer<Burger> =
        ModernPeople()
    val consumer3 : Consumer<Burger> =
        American()


    val consumer4 : Consumer<Food> =
        Everybody()
  //  val consumer5 : Consumer<Food> =ModernPeople() bu hata alıcak cunkı sub type in super type out olmalı
   // val consumer6 : Consumer<Food> =American()


    //val production7 : Production<Burger> = FoodStore()  // Error
   // val production8 : Production<Burger> = FastFoodStore()  // Error
    val production9 : Production<Burger> =
        InOutBurger()
}



//SuperType could be assigned subtype, use IN
//SubType could be assigned to SuperType, use OUT