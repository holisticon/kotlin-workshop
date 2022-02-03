
class Engine {
    companion object {
        val material = "steel"
        fun printMaterial() = println(material)
    }
}

Engine.Companion.printMaterial()
Engine.printMaterial()            // Same as line before
