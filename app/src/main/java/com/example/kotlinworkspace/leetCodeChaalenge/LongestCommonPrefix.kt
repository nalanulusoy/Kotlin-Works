package com.example.kotlinworkspace.leetCodeChaalenge


/**
 * Created by Nalan Ulusoy on 11,Haziran,2023
 */
fun main(args:Array<String>){
    println(longestCommonPrefix(arrayOf<String>("car","carry","carpet"))) // car
}

// Complexity O(m * n)
fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) {
        return ""
    }

    val shortestStr = strs.minByOrNull { it.length }!!
    var prefix = shortestStr

    for (str in strs) {
        while (!str.startsWith(prefix)) {
            prefix = prefix.substring(0, prefix.length - 1)
        }
    }

    return prefix
}

fun longestCommonPrefix2(strs: Array<String>): String {
    var prefix =strs[0]
    for (i in 1 until strs.size) {
        prefix = prefix.commonPrefixWith(strs[i], true)
    }
    return prefix
}
