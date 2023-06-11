package com.example.kotlinworkspace.hackerrank


/**
 * Created by Nalan Ulusoy on 25,Ekim,2022
 */
fun main() {
//println(countingValleys(12,"DDUUDDUDUUUD")) // 2
//println(countingValleys(8,"UDDDUDUU")) // 1
println(solution("{{{}{}{{}}}}"))

}

fun countingValleys(steps: Int, path: String): Int {
    var seaLevel = 0
    var valley = 0
    path.forEach {
        if (it == 'U'){
            seaLevel++
            if (seaLevel == 0)
            {
                valley +=1
            }
        }
        else {
            seaLevel -=1
        }
    }
    return valley
}

fun solution(path: String): Boolean {
    var left = 0
    var right = 0
    path.forEach {
        if (it == '{'){
            left += 1
        }
        else {
           right +=1
        }
    }
    return left == right
}
