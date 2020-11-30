import kotlin.random.Random

class Piramide {
    private val exampleCollection = arrayListOf(
            listOf(1, 3),
            listOf(3, 5),
            listOf("stranger"),
            listOf("null"))

    fun printedACollections() {
        var aleato = (-50..20).random()
        exampleCollection.add(listOf(aleato))
        for (listOf in exampleCollection) {
            print(aleato)
            println(listOf)
        }
    }
}