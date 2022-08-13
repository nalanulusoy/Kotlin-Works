package com.example.kotlinworkspace.solution


/**
 * Created by Nalan Ulusoy on 13,Ağustos,2022
 */
val array = arrayListOf(1, 2, 3, 3, 3, 4, 5, 5, 3, 14, 78,21,6)

fun main(args: Array<String>) {
  val list = findTwoNumberSumEqualNumber2(array,7)
    println(list)
}

// We give one number list  and number .We want to find solution which how many number value params inside numberList
fun getHowManyFindNumber(numberList: ArrayList<Int>, number: Int): Int {
    var count = 0
    numberList.forEach {
        if (it == number) count += 1
        else return@forEach
    }
    return count
}

//Best Solution
fun getHowManyFindNumber2(numberList: ArrayList<Int>, number: Int) =
    numberList.filter { it == number }.size

fun findLowerThanNumbers(numberList: ArrayList<Int>, number: Int): ArrayList<Int> {
    var lowerList = arrayListOf<Int>()

    numberList.forEach {
        if (it < number) {
            lowerList.add(it)
        } else return@forEach
    }
    return lowerList
}

//Best Solution
fun findLowerThanNumbers2(numberList: ArrayList<Int>, number: Int) =
    numberList.filter { it < number }


fun findMinAndMaksNumbers(numberList: ArrayList<Int>) {
    var min = numberList.first()
    var maks = numberList.first()

    numberList.forEach {
        if (min > it) {
            min = it
        } else {
            if (maks < it) {
                maks = it
            }
        }
    }
    println(min)
    println(maks)
}

//Best Solution
fun findMinAndMaksNumbers2(numberList: ArrayList<Int>) {
    println(numberList.min())
    println(numberList.max())
}

//Find inside list two number sum predicted number  O(n^2) complexity n^2 best case and worst case
fun findTwoNumberSumEqualNumber(numberList: ArrayList<Int>, number:Int): MutableList<Int> {
    val sumList = mutableListOf<Int>()
    numberList.forEach { item ->
         numberList.forEach {
             if(number == item+ it){
                 if(!sumList.contains(item)){
                     sumList.add(item)
                 }
                 if(!sumList.contains(it)){
                     sumList.add(it)
                 }
             }
             else return@forEach
         }
    }
    return sumList
}

//Best case O(n)
fun findTwoNumberSumEqualNumber2(nums: ArrayList<Int>, target: Int): MutableList<Int?> {
    val map = HashMap<Int, Int>()
    val sumList = mutableListOf<Int?>()
    for(i in nums.indices){
        map[i] = nums[i]
    }
    nums.forEachIndexed{ index,item->
        val temp = target - item
        if(map.containsValue(temp)){
            if(!sumList.contains(nums[index])){
                sumList.add(nums[index])
            }
        }
    }
    return  sumList
}






