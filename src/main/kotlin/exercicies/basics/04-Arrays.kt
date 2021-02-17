package exercicies.basics

fun q1Arrays() {
    /*
    * Looping sobre arrays e listas é uma técnica fundamental que apresenta muita flexibilidade no Kotlin. Vamos praticar.
    Exemplo básico
    Crie um array integer de números chamado numbers, de 11 a 15.
    Crie uma lista imutável vazia para Strings.
    Escreva um loop for que faça um loop sobre o array e adicione a representação de string de cada número da lista.
    Exemplo de desafio
    Como você pode usar um loop for para criar (uma lista de) números entre 1 e 100 que sejam divisíveis por 7?*/
    val array: IntArray = intArrayOf(11, 12, 13, 14, 15)
    val imutableList: List<String> = listOf()
    print("[")
    for (i in 0..97 step 7) {
        print("$i, ")
    }
    println("98]")
    val list = listOf(0..100)
    println(list)
}

fun main() {
    q1Arrays()
}