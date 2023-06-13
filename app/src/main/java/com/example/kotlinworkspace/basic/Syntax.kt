package com.example.kotlinworkspace.basic

import android.os.Build
import androidx.annotation.RequiresApi


/**
 * Created by Nalan Ulusoy on 12,Haziran,2023
 */

@RequiresApi(Build.VERSION_CODES.N)
fun main(args: Array<String>){
    val count = 10
    for (i in count downTo 1 step 2) {
        println(i.toString()  + "i")
    }

    for(i in 1.. count ){
        println(i)
    }
    for(i in  count downTo  3  step 4){
        println(i)
    }

    for (i in 0 .. 10){
        println(i)
    }

    // 3*3 matrix
    val matrix = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )


    val romanNumber = mutableMapOf<String, Int>("I" to 1, "V" to 5, "X" to 10)
    romanNumber["M"] = 1000
    println(romanNumber)
    println(romanNumber.entries.find { it.value.equals("X")}?.key)


    val list = listOf("elma", "armut", "muz", "elma", "çilek", "elma", "armut", "muz")

    val frequencyMap = mutableMapOf<String, Int>()
    var maxFrequency = 0

    for (item in list) {
        val count = frequencyMap.getOrDefault(item, 0) + 1
        frequencyMap[item] = count
        if (count > maxFrequency) {
            maxFrequency = count
        }
    }

    val mostFrequentElements = frequencyMap.filterValues { it == maxFrequency }.keys

    println("En çok tekrar eden eleman(lar): $mostFrequentElements")


    val sum = { x: Int, y: Int -> x + y }
    println(sum(3, 5)) // Çıktı: 8

    val wordCount = { word: String -> word.toCharArray().count() }
    println(wordCount) // 8

    val namesByLength = list.sortedWith(compareBy {
        -it.length })
    println(namesByLength) // [çilek, elma, armut, muz] uzunluğa göre ters sıralama

    var prices = listOf(1.5, 10.0, 4.99, 2.30, 8.19)
    val largePrices = prices.filter {
        it > 5.0 }
    println(largePrices)

    val appRatings = mapOf(
        "Calendar Pro" to arrayOf(1, 5, 5, 4, 2, 1, 5, 4),
        "The Messenger" to arrayOf(5, 4, 2, 5, 4, 1, 1, 2),
        "Socialise" to arrayOf(2, 1, 2, 2, 1, 2, 4, 2)
    )
    println(appRatings["Calendar Pro"])
}