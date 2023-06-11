package com.example.kotlinworkspace.leetCodeChaalenge


/**
 * Created by Nalan Ulusoy on 11,Haziran,2023
 */
fun main( args: Array<String>){
    // 121,11 palindrome when reverse 121,11 but 10 not palindrome  return 01
    println(isPalindrome(121)) //true
    println(isPalindrome(11)) // true
    println(isPalindrome(10)) // false
    println(isPalindrome(-121)) // false
}
//Complexity O(d) d represent step count
fun isPalindrome(x :Int) : Boolean{
    val isPalindrome = x.toString()
    val isPalindromeReverse = isPalindrome.reversed()
    if(isPalindrome == isPalindromeReverse) return true
    return false
}