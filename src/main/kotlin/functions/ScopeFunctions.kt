package org.frokanic.functions

/**
 *  Sources:
 *      - https://kotlinlang.org/docs/scope-functions.html
 *      - https://www.youtube.com/watch?v=Vy-dS2SVoHk
 */
fun main() {
    println("Starting let...")
    let()
    println("Let finished...")
}

/**
 *  Return Value: The lambda result.
 *  Context Object: it
 *
 *
 */
private var number: Int? = null
private var number2: Int? = 1

fun let() {
    number?.let { currentNum ->
        val number3 = currentNum + 1
        println("number2 = $number3")
    }

    val number4 = number2?.let { currentNum ->
        currentNum + 1
    }

    println("number3 = $number4")
}

fun run() {

}

fun with() {

}

fun apply() {

}

fun also() {

}