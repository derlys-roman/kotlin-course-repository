class Piramide {
    private val exampleCollection = arrayListOf(
            listOf(1, 3),
            listOf(3, 5),
            listOf("stranger"),
            listOf("null"))
    fun printedACollections() {
        for (listOf in exampleCollection) println(listOf)
    }
}