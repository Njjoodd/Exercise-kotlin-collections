fun main() {
    val countriesAndCapitals = mutableMapOf("USA" to "Washington", "France" to "Paris", "Germany" to "Berlin")

    countriesAndCapitals["Kuwait"] = "Kuwait City"
    println("Countries: ${countriesAndCapitals.keys}")
    println("Capitals: ${countriesAndCapitals.values}")
    countriesAndCapitals.remove("Germany")
    println("Final Map: $countriesAndCapitals")
}
