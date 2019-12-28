package com.example.kotlinworkspace.codeWars

fun main(args:Array<String>){
    println(reverseLetter("djx[]mvpxlnxvkfokgzl"))
}


fun reverseLetter(str: String): String {
    return Regex("[^A-Za-z]").replace(str,"").reversed()
}

fun reverseLetter2(str: String): String {
    return     str.reversed().filter { char ->  char.isLetter() }
}

fun reverseLetter3(str: String): String {
    return str.reversed().filter { Regex("^[a-z]$").containsMatchIn(it.toString()) }
}
fun reverseLetter4(str: String): String {
    return str
        .toCharArray()
        .reversedArray()
        .filter { it in 'a'..'z' }
        .joinToString("")
}

fun reverseLetter5(str: String): String =
    str.toCharArray().filter { it.isLetter() }.reversed().joinToString("")