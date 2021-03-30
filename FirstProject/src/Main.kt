fun main(args: Array<String>) {
    val p1 = Piramide()
    p1.printedACollections()
    p1.experimentsOfInternet()
    val primeiroDado = Dice(9)
    println("o dado tem ${primeiroDado.lado} lados e o lado caido é ${primeiroDado.rolar()}")
    val coin = Moeda()
    println(if (coin.jogarMoeda()==1)"cara" else "coroa")
    //println(coin.jogarMoeda())
}