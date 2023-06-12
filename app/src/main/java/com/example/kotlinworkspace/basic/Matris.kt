package com.example.kotlinworkspace.basic


/**
 * Created by Nalan Ulusoy on 12,Haziran,2023
 */
fun main(args: Array<String>){
    val matrix1 = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

    val matrix2 = arrayOf(
        intArrayOf(9, 8, 7),
        intArrayOf(6, 5, 4),
        intArrayOf(3, 2, 1)
    )

    val result = addMatrices(matrix1, matrix2)

    for (row in result) {
        for (element in row) {
            print("$element ")
        }
        println()
    }
}

fun addMatrices(matrix1: Array<IntArray>, matrix2: Array<IntArray>): Array<IntArray> {
    val numRows = matrix1.size
    val numCols = matrix1[0].size
    val result = Array(numRows) { IntArray(numCols) }

    for (i in 0 until numRows) {
        for (j in 0 until numCols) {
            result[i][j] = matrix1[i][j] + matrix2[i][j]
        }
    }

    return result
}

fun subtractMatrices(matrix1: Array<IntArray>, matrix2: Array<IntArray>): Array<IntArray> {
    val numRows = matrix1.size
    val numCols = matrix1[0].size
    val result = Array(numRows) { IntArray(numCols) }

    for (i in 0 until numRows) {
        for (j in 0 until numCols) {
            result[i][j] = matrix1[i][j] - matrix2[i][j]
        }
    }

    return result
}

fun getDiagonalValuesSum(matrix: Array<IntArray>): Int {
    val diagonalValues = mutableListOf<Int>()

    val numRows = matrix.size
    val numCols = matrix[0].size

    val minSize = minOf(numRows, numCols)

    for (i in 0 until minSize) {
        diagonalValues.add(matrix[i][i])
    }

    return diagonalValues.sum()
}

