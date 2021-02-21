package exercicies.functions

/*
* Crie um filtro que receba todos os curries e classifique-os pelo tamanho da string. -Dica: Depois de digitar o ponto (.), o IntelliJ lhe dará uma lista de funções que podem ser aplicadas.
Filtre a lista de especiarias para retornar todas que comecem com 'c' e terminam com 'e'. Faça isso de duas maneiras diferentes.
Pegue os três primeiros elementos da lista e retorne os que começam com 'c'.*/
fun main() {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper")
    spices.forEach { print("${it.length} ") }
    println()
    println(spices.filter { it[0] == 'c' && it[it.length - 1] == 'e' })
    println(spices.filter { it.startsWith('c') }.filter { it.endsWith('e') })
    println(spices.filter { it.startsWith('c') && it.endsWith('e') })
    println(spices.subList(0, 3).filter { it[0] == 'c' })
}