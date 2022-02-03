
fun String.obfuscate(): String {
    return this.replace("f", "t")
}

"coffee".obfuscate()     // "cottee"


// Also works with nullable types
fun String?.nullSafeUppercase(): String? {
    return this?.uppercase()
}

val x: String? = null
x.nullSafeUppercase()
