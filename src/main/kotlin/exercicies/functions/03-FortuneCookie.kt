package exercicies.functions

/*
* Crie um programa com uma função que retorna uma mensagem do cookie da sorte (fortune cookie) que você possa imprimir.

Crie uma função main().
A partir da função main(), acione uma função getFortuneCookie(), que retorne uma String.
Crie uma função getFortuneCookie () que não demande argumentos e retorne uma String.
No corpo de getFortuneCookie (), crie uma lista de fortunas. Aqui vão algumas ideias:

"You will have a great day!"
"Things will go well for you today."
"Enjoy a wonderful day of success."
"Be humble and all will turn out well."
"Today is a good day for exercising restraint."
"Take it easy and enjoy life!"
"Treasure your friends because they are your greatest fortune."
Abaixo da lista, imprima: "Enter your birthday: "

Dica: Use print() e não println()
Crie uma variável birthday.
Leia o formulário de input do usuário e atribua-o a birthday. Se não houver input válido, defina birthday como 1.
Dica: Use readLine() para ler uma linha de input (completada com Enter) como uma String.
Dica: No Kotlin, você pode usar o toIntOrNull() para converter um número como uma String em um Integer numérico. Se o usuário digitar "", toIntOrNull retornará "null".
Dica: Verifique se há null usando o operador ?, e use o operador ?: para gerenciar o caso null.
Divida o aniversário pelo número de fortunas e use o restante como o índice do que dever ser retornado.
Retorne a fortuna.
In main(), print: "Your fortune is: ", seguido da string de fortuna.
Prática extra:
Use um loop for que execute o código até o máximo de 10 vezes ou até que a fortuna "Take it easy" seja encontrada.*/

fun getFortuneCookie(): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.",
    )
    print("Enter your day birthday: ")
    return fortunes[(readLine()?.toIntOrNull() ?: 1) % fortunes.size]
}

fun main() {
    println(getFortuneCookie())
}
