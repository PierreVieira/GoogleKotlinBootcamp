package exercicies.basics

fun q1Strings() {
    /*Crie três variáveis String para trout,haddock e snapper.
    Use um modelo String para imprimir se você gosta ou não de comer esses tipos de peixe.*/
    val trout = "like"
    val haddock = "like"
    val snapper = "don't like"
    println("Trout: $trout\nHaddock: $haddock\nSnapper: $snapper.")
}

fun q2Strings() {
    /*As declarações when no Kotlin são como declarações 'case' ou 'switch' em outras linguagens.

   Crie uma declaração when com três comparações:

   Se o comprimento do fishName for 0, imprima uma mensagem de erro.
   Se o comprimento estiver no intervalo entre 3 ... 12, imprima "Good fish name”
   Se for qualquer outra coisa, imprima “OK fish name”.*/
    val fishName = "Haddock"
    println(when (fishName.length) {
        0 -> "ERROR"
        in 3..12 -> "Good fish name"
        else -> "OK fish name"
    })
}

fun main() {
    q1Strings()
    q2Strings()
}