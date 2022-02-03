import java.util.*

// Umgang mit Java Code
// Alles, was aus Java kommt, könnte null sein.
Date().toInstant() ?: throw RuntimeException("This shall not be null")
UUID.randomUUID() ?: throw RuntimeException("This shall not be null")
