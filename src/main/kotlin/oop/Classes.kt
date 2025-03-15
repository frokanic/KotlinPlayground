package org.frokanic.oop

fun main() {

}


/**
 *
 *
 */
class x() {

}


/**
 *
 *
 */
object l {

}

/**
 *
 *
 */
annotation class a


/**
 *
 *
 */
class ForInner() {
    inner class Inner() {

    }
}


/**
 *
 *
 */
sealed class s() {

}


/**
 *
 *
 */
enum class d


/**
 *
 *
 */
data class f(
    val x: String
)


/**
 *
 *
 */
data object g


/**
 *  Holds a primitive type, and adds "extra rules" to it.
 */
@JvmInline
value class Email(
    private val email: String
) {

    init {
        if (!email.contains('@')) {
            throw IllegalArgumentException("Invalid Email")
        }
    }
}


/**
 *
 *
 */
open class k

