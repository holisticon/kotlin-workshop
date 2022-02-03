import kotlin.random.Random

// Function with body in braces.
// Explicit return
fun randomInt(): Int {
    return Random.nextInt()
}

// Same, but one line.
// Without braces, without return.


// Works, but not considered good style.
fun badStyle(): Int =
    2


// Don't return anything (void in Java)
fun print(): Unit = println()


// Return type can be omitted, but I would only do that with Unit.
fun print() = println()
fun randomInt() = Random.nextInt()


// Parameters
fun add(i: Int, j: Int): Int = i + j


// Long parameter names
fun abstractGlobalSingletonStyleFactoryBuilder(
    metaphysicalFactoryPatternIndicator: Boolean,
    anotherExtraordinaryLongParameterName: String,
): Int = TODO("To be implemented")

