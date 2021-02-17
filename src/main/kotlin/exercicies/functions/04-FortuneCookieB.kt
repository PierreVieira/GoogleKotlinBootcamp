package exercicies.functions

/*
A função getFortune() deve estar recebendo apenas a fortuna, e não a data de aniversário,

Altere o seu programa Fortune Cookie da seguinte maneira:

Crie uma função chamada getBirthday() que receba a data de aniversário do usuário.
Transmita o resultado de getBirthday() para getFortune() usando um argumento Integer, e use-o para retornar a fortuna correta.
Remova a função de obter a data de aniversário de getFortune()
Em vez de calcular a fortuna com base na data de aniversário, use uma declaração 'when' para atribuir algumas fortunas da seguinte maneira (ou use suas próprias condições):
Se o dia de aniversário é 28 ou 31 ...
Se o dia do aniversário é na primeira semana ...
else… retorna a fortuna calculada como antes.
Dica: Existem várias maneiras de fazer esta declaração when. Quanto você pode Kotlinizar?*/

fun getBirthday(): Int {
    print("Enter your day birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String {
    val fortunes = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends, because they are your greatest fortune.")
    val index = when (birthday) {
        in 1..7 -> 4
        28, 31 -> 2
        else -> birthday.rem(fortunes.size) // birthday % fortunes.size
    }
    return fortunes[index]
}

fun main() {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }
}
