import java.time.OffsetDateTime

class Empty    // world's smallest class

class Scooter {

    private var lastInspection: OffsetDateTime? = null

    var brand: String? = null

    fun start() = println("Starting")    // Function definition

}

// Objektinstanzierung
val scooter = Scooter()
