package org.frokanic.dsa.algorithms.sorting

/**
 *  Time Complexity: O(n^2)
 *
 *  Insertion sort iterates through all of the elements, one by one, starting from the
 *  second one, all the way to the end. It compares them with all the previous ones,
 *  again, one by one. If the current element is smaller than the previous one, they
 *  switch place (assuming we are ordering the array in ascending order). If the element
 *  is not lesser that its previous one, we move one to comparing the next element to
 *  its previous ones.
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

    for (i in 2..<this.size) {
        for (j in i - 1 downTo 1) {
            if (this[i] >= this[j]) break

            val temp = this[i]
            this[i] = this[j]
            this[j] = temp
        }
    }
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