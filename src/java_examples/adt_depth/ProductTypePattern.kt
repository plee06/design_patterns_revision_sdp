package adt_depth


// Traits share interfaces between classes

// "A has a B and a C"

/*
* Of type C.
*
* */
data class Colour(val name: String) {


}
/**
 * Of type B.
 *
 * */
data class Food(val name: String) {


}

/**
 * Of type A that has a B and a C.
 *
 * */
class Doggie(val colour: Colour, val food: Food) {
    init {
        println("I am a class of type A that has a B and a C. In other words, I am a class of $this with a class of ${this.colour} and ${this.food}")
    }
}


// Or another has-a and relationship
interface InterfaceA {
    // has-a B and C.
    data class B(val name: String)
    data class C(val name: String)
}

fun main(args: Array<String>) {
    val d: Doggie = Doggie(Colour("Blue"), Food("Pizza"))

}

/*
* Basically the Product Type Pattern means of two types. Not one, not zero. Two!
*
* */



