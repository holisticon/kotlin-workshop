fun <T> List<T>.replaceOrAdd(that: List<T>, f: (T) -> Any): List<T> {
    val thatMapped = that.map(f)
    return this
        .filterNot { thatMapped.contains(f(it)) }
        .plus(that)
}

data class Company(val zip: String)

val companies = listOf(Company("22547"), Company("31228"))
val newCompanies = listOf(Company("22763"), Company("31228"))

val merged = companies.replaceOrAdd(newCompanies, Company::zip)

val merged2 = companies.replaceOrAdd(newCompanies) { it.zip }
