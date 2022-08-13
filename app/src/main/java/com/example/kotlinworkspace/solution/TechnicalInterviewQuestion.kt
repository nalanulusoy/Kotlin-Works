package com.example.kotlinworkspace.solution

import java.math.BigInteger


/**
 * Created by Nalan Ulusoy on 13,Ağustos,2022
 */

val array = arrayListOf<Int>(9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0, 1, 1, 1)

fun main(args: Array<String>) {
    val list = removeDuplicates(array.toIntArray())
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
fun findTwoNumberSumEqualNumber(numberList: ArrayList<Int>, number: Int): MutableList<Int> {
    val sumList = mutableListOf<Int>()
    numberList.forEach { item ->
        numberList.forEach {
            if (number == item + it) {
                if (!sumList.contains(item)) {
                    sumList.add(item)
                }
                if (!sumList.contains(it)) {
                    sumList.add(it)
                }
            } else return@forEach
        }
    }
    return sumList
}

//Best case O(n)
fun findTwoNumberSumEqualNumber2(nums: ArrayList<Int>, target: Int): MutableList<Int?> {
    val map = HashMap<Int, Int>()
    val sumList = mutableListOf<Int?>()
    for (i in nums.indices) {
        map[i] = nums[i]
    }
    nums.forEachIndexed { index, item ->
        val temp = target - item
        if (map.containsValue(temp)) {
            if (!sumList.contains(nums[index])) {
                sumList.add(nums[index])
            }
        }
    }
    return sumList
}

fun findSingleNumber(nums: ArrayList<Int>): MutableList<Int> {
    val singleNumbersList = mutableListOf<Int>()
    for (i in nums.indices) {
        if (nums.filter { it == nums[i] }.count() == 1) {
            singleNumbersList.add(nums[i])
        }
    }

    return singleNumbersList
}


//Input: digits = [9]
//Output: [1,0]
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
fun plusOne(digits: ArrayList<Int>): MutableList<Int> {
    var findNumber: BigInteger = BigInteger.ZERO
    val indexNum = mutableListOf<Int>()
    var num: BigInteger = BigInteger.ZERO
    for (i in digits.indices) {
        findNumber += digits[i].toBigInteger() * BigInteger.TEN.pow(digits.size - i - 1)
    }
    var nextNumber = findNumber + BigInteger.ONE

    while (nextNumber > BigInteger.ZERO) {
        num = nextNumber.rem(BigInteger.TEN)
        indexNum.add(num.toInt())
        nextNumber /= BigInteger.TEN
    }

    return indexNum.asReversed()
}

//Best Way
fun plusOne2(digits: ArrayList<Int>): IntArray {
    var list = mutableListOf<Int>()
    var carry = 1
    for (i in digits.size - 1 downTo 0) {
        list.add((digits[i] + carry) % 10)
        carry = (digits[i] + carry) / 10
    }

    if (carry == 1) list.add(1)
    return list.asReversed().toIntArray()
}

//Do not forget BigInteger ***
fun findNumberStep(number: Int): MutableList<Int> {
    var num = BigInteger.ZERO
    var nump = number.toBigInteger()
    val list = mutableListOf<Int>()
    while (nump > BigInteger.ZERO) {
        num = nump.rem(BigInteger.TEN)
        list.add(num.toInt())
        nump /= BigInteger.TEN
    }
    return list.asReversed()
}

//First think mod  ten  then div ten number but important BigInteger should type
fun findNumberStepSum(number: Int): Int {
    var num = BigInteger.ZERO
    var nump = number.toBigInteger()
    val list = mutableListOf<Int>()
    while (nump > BigInteger.ZERO) {
        num = nump.rem(BigInteger.TEN)
        list.add(num.toInt())
        nump /= BigInteger.TEN
    }
    return list.asReversed().sum()
}


fun containsDuplicate(nums: IntArray): Boolean {
    val data = HashMap<Int, Int>()
    nums.forEach {
        if (data.contains(it)) {
            return true
        } else {
            data[it] = it
        }
    }
    return false
}

fun containsDuplicate2(nums: IntArray): Boolean {
    //check nums.distinct() if it has same size as original then original is distinct
    //distinct aynı olan sayıları çıkarır
    return nums.size != nums.distinct().size
}

fun containsDuplicate3(nums: IntArray): Boolean {
    // nums.toList().groupingBy {it}.eachCount() bu satır listedeki her bir
    // elemanın sayısını key value mantığı ile oluşturur key sayı value adedi
    return nums.toList().groupingBy { it }.eachCount().any { it.value >= 2 }
}

fun removeDuplicates(nums: IntArray): Int {
    return nums.distinct().size
}








