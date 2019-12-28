package com.example.kotlinworkspace.basic

fun main(args:Array<String>){

    canAddFish(10.0, listOf(), 7, true)
    //canAddFish(10.0, listOf(3,3,3))
   // canAddFish(9.0, listOf(1,1,3), 3)
    println(whatShouldIDoToday("sad"))
}



fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}


fun whatShouldIDoToday(mood:String,weather:String="sunny",tempature:Int=24):String{

  return when{
      mood == "sad" && weather == "rainy" && tempature == 0 -> "stay in bed"
      tempature > 35 -> "go swimming"
        mood=="happy" && weather=="Sunny"->  "go for a walk"
        else-> "Stay home and read."
    }



}

fun isVeryHot (temperature: Int) = temperature > 35
fun isSadRainyCold (mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0
fun isHappySunny (mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun whatShouldIDo(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
    return when {
        isVeryHot(temperature) -> "go swimming"
        isSadRainyCold(mood, weather, temperature) -> "stay in bed"
        isHappySunny(mood, weather) -> "go for a walk"
        else -> "Stay home and read."
    }
}






