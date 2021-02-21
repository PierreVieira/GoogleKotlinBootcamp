package exercicies.functions
/*Crie um programa que sugira uma atividade baseada em vários parâmetros.

Comece em um novo arquivo com uma função main.
A partir de main(), crie uma função whatShouldIDoToday().
Deixe a função com três parâmetros.
mood: um parâmetro de string obrigatório
weather: um parâmetro de string cujo padrão é "sunny"
temperature: um parâmetro Integer padronizado para 24 graus (Celsius).
Use um construtor when para retornar algumas atividades usando como base combinações de condições.*/

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        temperature == 21 -> "This is a good temperature for fish. Try to keep it."
        mood == "happy" && weather == "sunny" -> "go for a walk"
        else -> "Stay home and read."
    }
}

fun main() {
    println(whatShouldIDoToday("sad"))
}