package org.frokanic.dsa.algorithms.sorting

/**
 *  Time Complexity: O(n^2)
 *
 */
fun main() {
    insertionSortExamples(1, arrayOf(8, 7, 9, 2, 15, 4, 6))
    println()
    insertionSortExamples(2, arrayOf(1, 2, 4, 9, 15, 23))
    println()
    insertionSortExamples(3, arrayOf(90, 80, 7, 6, 4))
    println()
    insertionSortExamples(4, arrayOf(2, 7, 3, 1, 5, 3))
}

fun Array<Int>.insertionSort() {


}

private fun insertionSortExamples(
    noOfExample: Int,
    array: Array<Int>
) {
    println("Example $noOfExample")
    println("Initial array          ---> ${ array.contentToString() }")
    array.insertionSort()
    println("Insertion sorted array ---> ${ array.contentToString() }")
}