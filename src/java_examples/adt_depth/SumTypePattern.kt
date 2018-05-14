package adt_depth

/**
 * The Sum Type Pattern is a way to describe "A is a B or C" i.e. A can be B or it can B.
 *
 * A "sealed trait" in Scala means sealed interface in Kotlin. "final case class" in Scala means data class in Kotlin.
 *
 * The whole point of the interface being A is so that A cannot be implemented outside of the file. In other words,
 * A is restricted only to those in the same file.
 *
 * The data class is to restrict any subclassing. B or C can only be of A. Nothing else can be of B or C, if that
 * was the case it would violate the Sum Type Pattern!
 *
 * Note: Unfortunately in Kotlin you cannot have a sealed interface. Thus, use an interface.
 * */


// Assume no one will extend this
interface SealedA

data class B(val name: String) : SealedA // B implements A. i.e. B is A
data class C(val name: String) : SealedA // C implements A. i.e. C is A


fun main(args: Array<String>) {
    val a: SealedA = B("I'm a B.")
    val b: SealedA = C("I'm a C.")

}

/**
 * Key point to remember is that with the Sum pattern the interface is extended by B or C.
 * Where as with the Product pattern the interface is composed of B and C. !
 *
 * */