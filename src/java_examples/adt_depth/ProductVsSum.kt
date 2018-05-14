package adt_depth

/**
 * In summary we can say that the Sum type is an "is-a" relationship and that the Product type is an "has-a"
 * relationship. i.e.
 *
 * for Product: "A has a B and a C"
 * for Sum: "A is a B or a C"
 *
 * So right now we have the following:
 *          AND         OR
 * is-a     ???         Sum         "A IS A B OR C"
 * has-a    Product     ???         "A HAS A B AND C"
 *
 *
 * */


/**
 * The is-a and relationship is represented by "A is-a B AND C" this involves multiple inheritance
 * which is not allowed in Kotlin.
 *
 *
 * The has-a or relationship is represented by "A has-a B or C" this involves A being composed of some class
 * called D in which D is extended (has-a subclasses) of B or C.
 *
 *
 * */




/**
 * Example of has-a or relationship "A has-a B or C"
 *
 * */

// Here the MyInterfaceA is either composed of B or C. Thus has-a B or C because it is used by
// D and E which are composed of either classB or classC thus making MyInterface having a has-a with either classB or
// classC.
interface MyInterfaceA

class classB
class classC
data class D(val b: classB) : MyInterfaceA
data class E(val c: classC) : MyInterfaceA


/*
* Now we have D which is implemented by B2 or C2.
* So we can say D has-a B2 or C2.
* Meaning that because A has-a D.
* We can say that A has-a B2 or C2. Transitive dependency!
*
* Test this.
*
* */


fun main(args: Array<String>) {

}