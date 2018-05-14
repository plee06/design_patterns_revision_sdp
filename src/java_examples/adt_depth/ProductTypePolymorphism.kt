package adt_depth

/**
 *
 * The question is "how do we break down A that has B and C to get some result D?"
 *
 * Remember that Product Type is "A has-a B and C"
 *
 * */

class ProductC
class ProductB

data class A(val b: ProductB, val C: ProductC) {


    // How do we decompose this to get some result D?

    // Simply define a method to extract D by using B and C. Because A is composed of "has-a B and C" we can
    // simply declare a method within A to extract B and C to get D.

    fun getD() {
        TODO("Do some stuff here to get D by extracting B and C within A.")
    }
}