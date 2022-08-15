package com.example.kotlinworkspace.sorting


/**
 * Created by Nalan Ulusoy on 15,Ağustos,2022
 */
//Best case O(nlogn) avarage O(nlogn) worst case O(nlogn)
//Typically 2-3 times slower than well-implemented QuickSort.
// The reason for slowness is a lack of locality of reference.
//https://www.raywenderlich.com/books/data-structures-algorithms-in-kotlin/v1.0/chapters/17-heap-sort
fun <T> Array<T>.heapSort(comparator: Comparator<T>) {
    this.heapify(comparator)
    for (index in this.indices.reversed()) { // 1
        this.swapAt(0, index) // 2
        siftDown(0, index, comparator) // 3
    }
}
fun <T> Array<T>.swapAt(first: Int, second: Int) {
    val aux = this[first]
    this[first] = this[second]
    this[second] = aux
}

private fun leftChildIndex(index: Int) = (2 * index) + 1
private fun rightChildIndex(index: Int) = (2 * index) + 2
fun <T> Array<T>.siftDown(
    index: Int,
    upTo: Int,
    comparator: Comparator<T>
) {
    var parent = index
    while (true) {
        val left = leftChildIndex(parent)
        val right = rightChildIndex(parent)
        var candidate = parent
        if (left < upTo &&
            comparator.compare(this[left], this[candidate]) > 0
        ) {
            candidate = left
        }
        if (right < upTo &&
            comparator.compare(this[right], this[candidate]) > 0
        ) {
            candidate = right
        }
        if (candidate == parent) {
            return
        }
        this.swapAt(parent, candidate)
        parent = candidate
    }
}

fun <T> Array<T>.heapify(comparator: Comparator<T>) {
    if (this.isNotEmpty()) {
        (this.size / 2 downTo 0).forEach {
            this.siftDown(it, this.size, comparator)
        }
    }
}
fun main(args: Array<String>) {
    val array = arrayOf(6, 12, 2, 26, 8, 18, 21, 9, 5)
    val descending = Comparator { first: Int, second: Int ->
        when {
            first < second -> 1
            first > second -> -1
            else -> 0
        }
    }
    println("Unsorted: ${array.joinToString()}")
    array.heapSort(descending)
    println("Sorted: ${array.joinToString ()}")
}

