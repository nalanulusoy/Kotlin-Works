package com.example.kotlinworkspace.codeWars

fun longest(s1:String, s2:String):String {
    return s1.plus(s2).toCharArray().distinct().sorted().joinToString("")
}
fun main(args:Array<String>){
   var a = "xyaabbbccccdefww"
   var b = "xxxxyyyyabklmopq"

    println(longest(a, b))
    println(smallEnough(intArrayOf(80, 117, 115, 104, 45, 85, 130, 115), 120))

}
fun smallEnough(a : IntArray, limit : Int) : Boolean {
if(a.max()!! <=limit)return true
    return false
}








