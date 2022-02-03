
// Define simple function
fun play(amount: Double, cheat: Boolean): Unit = TODO("Implement")


// No named parameters
play(3.0, false)


// Named parameters
play(amount = 4.0, cheat = true)


// Named parameters, different order
play( cheat = true, amount = 4.0)


// Named and unnamed parameters mixed (don't do that)
play(4.0, cheat = true)


// Named and unnamed parameters mixed (don't do that)
play(amount = 4.0, true)


// TODO Add `flux: Double` as parameter after the amount.
