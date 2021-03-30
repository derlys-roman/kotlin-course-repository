class Moeda {
    var lados: Int = 2
    fun jogarMoeda(): Int {
        return (1..lados).random()
    }
}