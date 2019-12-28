package com.example.kotlinworkspace.basic

fun main(args:Array<String>){




    //Mutable List can be modify

   val androidprograminLanguage= mutableListOf<String>("kotlin","java")
    val androidTechnology= mutableListOf<String>("android Jetpack","Cloud-based mobile apps","IOT features","Artificial Intelligence (AI) and Machine learning")
            androidprograminLanguage.addAll(androidTechnology)
    androidprograminLanguage.add("python")
    for(item in androidprograminLanguage)
        println(item)


    //List can not be modify

    val androidLanguage= listOf("kotlin","java")
    val androidTech=listOf("android Jetpack","Cloud-based mobile apps","IOT features","Artificial Intelligence (AI) and Machine learning")
    androidTech.reversed().forEach {
        print(it)
    }
    androidLanguage.reversed()
    for(item in androidLanguage)
        println(item)


    val androidLanguageMap= mapOf<String,Int>("kotlin" to 2,"java" to 1)

    println(androidLanguageMap.get("kotlin"))
    val androidLanguageMutableMap= mutableMapOf<String,Int>("kotlin" to 2,"java" to 1)
    androidLanguageMutableMap.put("python" , 3)
    for(item in androidLanguageMutableMap)
        println(item)

}