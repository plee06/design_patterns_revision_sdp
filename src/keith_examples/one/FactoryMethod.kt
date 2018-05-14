package one

// Here we define an interface called Currency.
// This is the "Factory Interface" for all subclasses to implement which has a code
interface Currency {
    val code: String
}

// Here we define two subclasses of Currency
class Euro(override val code: String = "EUR") : Currency
class UnitedStatesDollar(override val code: String = "USD") : Currency

// We then define an enum class with types
enum class Country {
    UnitedStates, Spain, UK, Greece
}

// This is the actual Factory Implementation which returns an Instance that we need
class CurrencyFactory {
    // Concrete Creator method
    fun currencyForCountry(country: Country): Currency? {
        when (country) {
            Country.Spain, Country.Greece -> return Euro()
            Country.UnitedStates -> return UnitedStatesDollar()
            else -> return null
        }
    }
}


// Program run
fun main(args: Array<String>) {
    val noCurrencyCode = "No Currency Code Available"

    // Instantiate Factory
    // Run Factory method and pass in the Country we want
    val greeceCode = CurrencyFactory().currencyForCountry(Country.Greece)?.code ?: noCurrencyCode
    println("Greece currency: $greeceCode")

    val usCode = CurrencyFactory().currencyForCountry(Country.UnitedStates)?.code ?: noCurrencyCode
    println("US currency: $usCode")

    val ukCode = CurrencyFactory().currencyForCountry(Country.UK)?.code ?: noCurrencyCode
    println("UK currency: $ukCode")
}