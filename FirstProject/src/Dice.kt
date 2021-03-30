class Dice(var lado: Int) {
    fun rolar(): Int {

        return (1..lado).random()
    }
}