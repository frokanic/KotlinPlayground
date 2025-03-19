package org.frokanic.dsa.algorithms.sorting

/**
 *  Time Complexity: O(n^2)
 *
 */
fun main() {
    selectionSortExamples(1, arrayOf(8, 7, 9, 2, 15, 4, 6))
    println()
    selectionSortExamples(2, arrayOf(1, 2, 4, 9, 15, 23))
    println()
    selectionSortExamples(3, arrayOf(90, 80, 7, 6, 4))
    println()
    selectionSortExamples(4, arrayOf(2, 7, 3, 1, 5, 3))
}

fun Array<Int>.selectionSort() {

    for (i in indices) {
        var minIndex = i
        for (j in i + 1..< this.size) {
            if (this[j] < this[minIndex]) {
                minIndex = j
            }
        }

        if (this[minIndex] == this[i]) continue

        val temp = this[i]
        this[i] = this[minIndex]
        this[minIndex] = temp
    }
}

private fun selectionSortExamples(
    noOfExample: Int,
    array: Array<Int>
) {
    println("Example $noOfExample")
    println("Initial array          ---> ${ array.contentToString() }")
    array.selectionSort()
    println("Selection sorted array ---> ${ array.contentToString() }")
}