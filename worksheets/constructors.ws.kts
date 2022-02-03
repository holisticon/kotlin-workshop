import java.time.OffsetDateTime

// Class with a primary constructor
class Company(name: String)

// Instantiate a class. No `new` required.
val holisticon = Company(name = "Holisticon")

// What is the difference?
class Company1(name: String)
class Company2(val name: String)
class Company3(var name: String)
class Company4(private var name: String)

val c = Company4(name = "x")


class Person(
    // Primary constructor
    val givenName: String,
    val familyName: String,
) {

    // Will be calculated on instantiaton of the class.
    private var fullName: String = "$givenName $familyName"

    // Place initialization code in init Blocks
    init {
        println(fullName)
    }

}


