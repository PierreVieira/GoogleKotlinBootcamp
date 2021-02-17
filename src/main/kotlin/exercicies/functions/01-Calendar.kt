package exercicies.functions

/*
    Crie um novo arquivo Kotlin.
    Copie e cole a função main() de Hello World para o arquivo.
    Crie uma nova função dayOfWeek().
    No corpo da função, imprima "What day is it today?"
    Acione dayOfWeek() a partir de main().
    Execute o programa.*/

import java.util.*

fun convertNumberDay(numberDay: Int): String {
    return when (numberDay) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        else -> "Saturday"
    }
}

fun dayOfWeek() {
    println("What day is it today? ${convertNumberDay(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))}.")
}

fun main() {
    dayOfWeek()
}
