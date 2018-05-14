package adt_depth

/**
 * Remember that the Sum Type is the following: "A is-a B or C" i.e. there is no composition, either A
 * is a B or A is a C.
 *
 * How do we use Structural Recursion to extract some result D?
 *
 *
 * */


/*
*
* The answer is to declare an abstract method in A1 to be override in B1 or C1 which allows either B1 or C1
* to extract some result D by utilizing B or C
*
* */
interface A1 {

    fun extract(): ExtractMe // To be overridden in is-a B or C to extract result D
}



// Here A1 is-a B1 or C1. How do we decompose to get result D?
data class B1(val name: String) : A1 {
    override fun extract(): ExtractMe {
        TODO("Extract by utilizing B1")
    }
}
data class C1(val name: String) : A1 {
    override fun extract(): ExtractMe {
        TODO("Extract by utilizing C1")
    }
}



class ExtractMe

