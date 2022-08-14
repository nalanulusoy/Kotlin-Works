package com.example.kotlinworkspace.sorting

/**
 * Created by Nalan Ulusoy on 13,Ağustos,2022
 */
// complexity avarage O(logn) worst case O(logn) best case O(1)
fun binarySearch(inputList: ArrayList<Int>, item: Int) {
    val listSorted = inputList.sorted()
    var low = 0
    var high = listSorted.size - 1
    var stepCount = 0
    var isItemFound = false
    while (low <= high) {
        val mid = (low + high) / 2
        val guess = listSorted[mid]
        stepCount++
        when {
            guess == item -> {
                println("Your number $item was found in $stepCount steps")
                isItemFound = true
            }
            guess > item -> high = mid - 1
            else -> low = mid + 1
        }
        if (isItemFound) break //"break" is not allowed in "when" statement
    }
    if (!isItemFound) {
        println("Your number wasn't found")
    }
}

fun main(args: Array<String>) {
    val array = arrayListOf<Int>(1, 15, 13, 63, 34, 21, 8, 9, 3, 4)
    binarySearch(array, 63)
    //Kotlin has Function binary search return Int but want to sorted list then find element
    val number = array.sorted().binarySearch(63)
    println("Binary Search :" + number + "KotlinFunction")

    //Kotlin binary Search Function
   /* fun <T : Comparable<T>> List<T?>.binarySearch(
        element: T?,
        fromIndex: Int = 0,
        toIndex: Int = size
    ): Int {

        var low = fromIndex
        var high = toIndex - 1

        while (low <= high) {
            val mid = (low + high).ushr(1) // safe from overflows
            val midVal = get(mid)
            val cmp = compareValues(midVal, element)

            if (cmp < 0)
                low = mid + 1
            else if (cmp > 0)
                high = mid - 1
            else
                return mid // key found
        }
        return -(low + 1)  // key not found
    }*/
}
