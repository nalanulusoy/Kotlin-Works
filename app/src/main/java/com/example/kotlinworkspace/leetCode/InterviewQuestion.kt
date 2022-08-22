package com.example.kotlinworkspace.leetCode


/**
 * Created by Nalan Ulusoy on 22,Ağustos,2022
 */

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val ans = ArrayList<Int>()
    val nums1List = nums1.toMutableList()
    val nums2List = nums2.toMutableList()

    for(i in nums2List.indices) {
        if(nums1List.isEmpty()) break

        if(nums1List.contains(nums2List[i])) {
            ans.add(nums2List[i])
            val idx = nums1List.indexOf(nums2List[i])
            nums1List.removeAt(idx)
        }
    }

    return ans.toIntArray()
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val mm = HashMap<Int, Int>()

    var res = mutableListOf<Int>()

    for (i in nums.indices) {
        mm[nums[i]] = i
    }

    for (i in nums.indices) {
        val temp = mm.get(target - nums[i])
        if (temp != null && (temp ?: -1) > i) {
            res.add(i)
            res.add(mm.getOrElse(target-nums[i], {0}))
        }
    }

    return res.toIntArray()
}



fun main() {
    val array1 = arrayListOf(3,2,4).toIntArray()
    val array2 = arrayListOf(9, 4, 9, 8, 4).toIntArray()
    val list = intersect(array1, array2)
    println(list.toList())
    println(twoSum(array1,6).toList())
}