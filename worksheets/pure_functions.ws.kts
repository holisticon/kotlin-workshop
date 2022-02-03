// pure function
fun add(x: Int, y: Int): Int = x + y

// not a pure function
fun removeChildren(persons: MutableList<Person>): Unit {
    persons.removeAll(persons.filter { it.age < 18 })
}

// also not a pure function
fun removeChildren(persons: MutableList<Person>): List<Person> {
    persons.removeAll(persons.filter { it.age < 18 })
    return persons
}




data class Person(val age: Int)
