import kotlin.random.Random

// If expression
val a = Random.nextInt(0, 10)
val b = Random.nextInt(5, 15)

val max = if (a > b) {a} else {b}


// When expression
val x = Random.nextInt(0, 12)

val result = when (x) {
    0 -> "None"
    in 1..9 -> "Low"
    else -> "Huge"
}


// Try expression
val amount = try {
    TODO("Something dangerous")
    "some result"
} catch (e: Exception) {
    TODO("Something safe")
}
