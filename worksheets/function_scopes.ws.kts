import java.math.BigDecimal

data class PersonDto(val name: String)
data class PersonEntity(val id: String, val name: String)

// Package function.
// Ersatz für statische Methoden, die eigentlich nicht in einer Klasse (versteckt) liegen müssen.
fun map(personEntity: PersonEntity): PersonDto = PersonDto(name = personEntity.name)

// Member function
class Square {
    fun toCircle(): Unit = throw NotImplementedError()
}

// Local function
class BusinessService {

    fun calculateSomethingComplicated(earnings: BigDecimal): Int {

        fun calculateSomethingSimple(earnings: BigDecimal): String {
            return earnings.toEngineeringString()
        }

        val intermediateResult = calculateSomethingSimple(earnings)

        return intermediateResult.length
    }

}

