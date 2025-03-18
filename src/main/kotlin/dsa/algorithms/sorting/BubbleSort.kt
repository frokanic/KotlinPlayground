package org.frokanic.dsa.algorithms.sorting

/**
 *  Time Complexity: O(n^2)
 *
 *  In bubble sort, we start by going through all of the array, and comparing
 *  the elements in pairs, linearly, and switching them, if the first element
 *  of the pair we're comparing is larger that the second element. The idea
 *  behind it is that at some point we will come across the largest one and
 *  bring it, "bubble it", to the top.
 *
 *  After a successful iteration we will have the largest item to the top.
 *
 *  Then, we will repeat the process, for the subset of the array, that is our
 *  resulted array, ignoring the last, sorted item.
 *
 *  If in a full iteration of a subarray, no pairs switched positions, that means
 *  the array is fully sorted, and no further iteration is needed.
 */
fun main() {
    bubbleSortExamples(1, arrayOf(2, 7, 4, 1, 5, 3))
    println()
    bubbleSortExamples(2, arrayOf(1, 2, 4, 9, 15, 23))
    println()
    bubbleSortExamples(3, arrayOf(90, 80, 7, 6, 4))
}

fun Array<Int>.bubbleSort() {
    var somePairChanged: Boolean

    for (i in this.size - 1 downTo 1) {
        somePairChanged = false
        for (j in 0 until i) {
            if (this[j] > this[j + 1]) {
                val temp = this[j + 1]
                this[j + 1] = this[j]
                this[j] = temp
                somePairChanged = true
            }
        }
        if (!somePairChanged) return
    }
}

fun bubbleSortExamples(
    noOfExample: Int,
    array: Array<Int>
) {
    println("Example $noOfExample")
    println("Initial array       ---> ${ array.contentToString() }")
    array.bubbleSort()
    println("Bubble sorted array ---> ${ array.contentToString() }")
}