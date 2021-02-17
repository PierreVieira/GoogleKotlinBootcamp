package exercicies.functions

/*
* Acomode mais peixes
Crie uma função que verifique se podemos adicionar outro peixe em um tanque que já tenha peixes.

Quantos peixes em um tanque?
A regra mais conhecida para estocagem em um tanque é a regra de “uma polegada por peixe, por galão de água.” Levando em consideração que o tanque não tenha nenhum tipo de decoração ocupando espaço.

Normalmente, um tanque com decorações pode conter uma dimensão total de peixes (em polegadas) menor ou igual a 80% do tamanho do tanque (em galões). Um tanque sem decorações pode ter um volume total de peixe de até 100% do tamanho do tanque.

Por exemplo:
Um tanque de 10 galões com decoração, pode conter até 8 polegadas de peixes de 4 x 2 polegadas, por exemplo.
Um tanque de 20 galões sem decoração, pode conter até 20 polegadas de peixes de 6 x 1 e 2 x 2 polegadas, por exemplo.
Função fitMoreFish
Crie uma função que demande esses argumentos:

tankSize (em galões)
currentFish (uma lista de Ints representando o tamanho de cada peixe que já esteja dentro do tanque)
fishSize (o tamanho do novo peixe que adicionaremos ao tanque)
hasDecorations (true se o tanque tiver decorações, falso se não)
Suponha que, normalmente, um tanque tem enfeites e que um peixe típico tem 2 polegadas. Isso significa que você pode definir esses valores como parâmetros padrão.*/

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    var sumFish = 0
    currentFish.forEach { fish -> sumFish += fish }
    return fishSize + sumFish <= tankSize.times(if(hasDecorations) 0.8 else 1.0)
}

fun main() {
    println(canAddFish(10.0, listOf(3,3,3)))
    println(canAddFish(8.0, listOf(2,2,2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1,1,3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
}