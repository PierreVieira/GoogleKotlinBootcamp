package exercicies.functions

/*Exercício: Greetings, Kotlin
Crie uma função main() que receba um argumento representando a hora no formato de 24 horas (entre 0 e 23, incluindo esse dois valores).

Na função main(), verifique se a hora é anterior ao meio-dia (<12) e imprima "Good morning, Kotlin"; caso contrário, imprima "Good night, Kotlin".

Observações
Lembre-se que todos os argumentos da função main() são Strings, então você terá que converter este argumento para uma Int antes de aplicar a verificação.

Avançado
Tente usar os modelos de string do Kotlin para fazer isso em apenas uma linha.
*/

fun main(args: Array<String>) {
    print(if (args[0].toInt() < 12) "Good morning, Kotlin" else "Good night, Kotlin")
}