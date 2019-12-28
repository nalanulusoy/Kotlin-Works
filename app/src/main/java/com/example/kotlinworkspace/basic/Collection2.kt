package com.example.kotlinworkspace.basic

fun main(args:Array<String>){

    val allBooks= setOf<String>("Hamlet by William Shakespeare,Romeo and Juliet by William Shakespeare")
    val library= mapOf<String,String>("Hamlet" to "William Shakespeare","Romeo and Juliet" to "William Shakespeare")



    val library2 = mapOf("Shakespeare" to allBooks)
    println(library2.any { it.value.contains("Hamlet") })
   println(library.any {
       it.value=="Hamlet"
   })
    val moreBooks= mutableMapOf <String,String>("Hamlet" to "William Shakespeare","Romeo and Juliet" to "William Shakespeare")
    moreBooks.putAll(library)
    moreBooks.getOrPut("Jungle Book") { "Kipling" }
    moreBooks.put("Ruzgar gibi gecti","William Shakespeare")
    for(item in moreBooks)
        println(item)

}