import java.time.OffsetDateTime
import java.util.*

class Person(
    val id: UUID = UUID.randomUUID(),
    val firstName: String = "Paul",
    val lastName: String = "Tester",
    val birthDate: OffsetDateTime = OffsetDateTime.now().minusYears(42)
)

val paul = Person()
val youngPaul = Person(birthDate = OffsetDateTime.now().minusYears(3))
