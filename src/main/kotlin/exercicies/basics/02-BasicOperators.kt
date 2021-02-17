package exercicies.basics

fun q1BasicOperators() {
    /*Resolva o problema abaixo usando os métodos do operador, em uma linha de código.

Se você começar com 2 peixes e eles se reproduzirem duas vezes, produzindo 71 filhotes na primeira vez, e 233 na segunda.
13 peixes são engolidos por uma moreia faminta. Quantos peixes sobraram?
Quantos aquários são necessários se cada um comportar 30 peixes?

Dica: Você pode encadear acionamentos de método.
Dica: Você pode acionar os métodos em números, e o Kotlin irá convertê-los em objetos.*/
    println(2.plus(71).plus(233).minus(13).div(30).plus(1))
}

fun q2BasicOperators() {
    /* Crie uma variável String rainbowColor, defina seu valor de cor e altere-a.
       Crie uma variável blackColor cujo valor não possa ser alterado depois de atribuído. Mesmo assim, tente alterar.*/
    var rainbowColor: String = "blue"
    rainbowColor = "yellow"
    val blackColor = "black"
//    blackColor = "white" ERROR

}

fun q3BasicOperators() {
    /* Declare duas variáveis, greenColor e blueColor. Use duas formas diferentes de defini-las para null.*/
    var greenColor = null
    var blueColor: Int? = null
}

fun q4BasicOperators() {
    /*Crie uma lista com dois elementos que sejam nulos, e faça isso de duas maneiras diferentes.
      Agora, crie uma lista em que a lista seja nula.*/
    val listTwoElementsNull: List<Int?> = listOf(null, null)
    val listNull: List<Int>? = null
}

fun q5BasicOperators() {
    /*Crie uma variável inteira anulável chamada nullTest, e defina-a como null.
    Use uma verificação nula que aumente o valor em um se não for nulo. E, caso contrário, retorne 0 e imprima o resultado.
    Dica: Use o operador Elvis.*/
    val nullTest: Int? = null
    println(nullTest?.inc() ?: 0)
}

fun main() {
    q1BasicOperators()
}