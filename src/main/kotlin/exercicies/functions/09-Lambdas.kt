package exercicies.functions

/*
* Crie um lambda e atribua-o a rollDice, que retorna um lançamento de dado (número entre 1 e 12).
Estenda o lambda para fazer um argumento indicando o número de lados dos dados usados para o teste.
Se você não tiver feito isso ainda, corrija o lambda para retornar 0 se o número de lados transmitidos for 0.
Crie uma nova variável, rollDice2, para este mesmo lambda usando a notação de tipo de função.*/

var rollDice: (Int) -> Int =  {sides ->
    when(sides) {
        0 -> 0
        else -> (1..sides).random()
    }
}

fun gamePlay(functionGame: (Int) -> Int = rollDice) {
    println(functionGame(6))
}

fun main () {
    gamePlay()
}