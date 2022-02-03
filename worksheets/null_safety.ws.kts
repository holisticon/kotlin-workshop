
var a: Int = null    // Compile error: null cannot be assigned

var b: Int? = null   // ok

var c: Int? = 3      // ok

var d: Int = c       // Compiler error: type mismatch

var e: Int = c!!     // e = 3. NPE if b = null.

var f: Int = b?.unaryMinus() ?: 0    // -b or 0 if b is null



