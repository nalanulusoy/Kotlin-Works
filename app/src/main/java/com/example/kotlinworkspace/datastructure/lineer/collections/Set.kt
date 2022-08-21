package com.example.kotlinworkspace.datastructure.lineer.collections


/**
 * Created by Nalan Ulusoy on 21,Ağustos,2022
 */
/* Set each item only one time can possible store .
Set<T> stores unique elements */
fun main(){
    val citySet = setOf("Paris", "Mexico City", "Sofia", "Rome","Rome")
    println(citySet) //[Paris, Mexico City, Sofia, Rome]
    val citySet2 = mutableSetOf("Madrid", "Venice", "Rome", "Berlin")
    citySet2.add("Nice")
    citySet2.add("Barcelona")
    citySet2.add("İstanbul")
    citySet2.add("İstanbul")
    citySet2.add("İstanbul")
    println(citySet2)// [Madrid, Venice, Rome, Berlin, Nice, Barcelona, İstanbul]
    citySet2.remove("Venice")
    citySet2.map { item->
        println("City: $item")
    }
    println(citySet2) //[Madrid, Rome, Berlin, Nice, Barcelona, İstanbul]
    val citySet3 = hashSetOf("Madrid", "Venice", "Rome", "Berlin")
    citySet3.remove("Venice")
    citySet3.add("Berlin")
    citySet3.add("Rome")
    println("HashSet:$citySet3") //[Rome, Madrid, Berlin]

}