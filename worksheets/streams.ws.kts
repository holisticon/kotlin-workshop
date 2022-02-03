
listOf("kif", "leela", "amy").forEach { println(it) }

setOf("kif", "leela", "amy")
    .filter { it.startsWith("k") }
    .map { it.uppercase() }
    .forEach { println(it) }



// More complex example. Good example?
data class Company(val employees: List<Person>)
data class Person(val address: Address)
data class Address(val city: String)

fun doSomething(companies: List<Company>): Unit {

    companies
        .filter { it.employees.size > 1 }
        .map { it.employees[0] }
        .map { it.address }
        .sortedBy { it.city }
        .map { it.city }
        .first()

}
