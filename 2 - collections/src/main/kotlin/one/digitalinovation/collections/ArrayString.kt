package one.digitalinovation.collections

fun main() {
    /**
     - para criar um array devemos informar o tamanho e uma inicializacao com valores
     - a partir dessa inicializacao o tipo do Array é inferido
     - é possivel usar o template Array <T> mas a inferencia ja faz isso
     */

    val names = Array(size = 5) {""}

    names[0] = "Julia"
    names[1] = "Myllene"
    names[2] = "Sabrina"
    names[3] = "Joao Vitor"
    names[4] = "Vitor"

    println("Imprimindo os nomes com for: ")
    for (name in names) {
        println(name)
    }

    println("---------------------------")

    names.sort()
    println("Imprimindo os nomes com forEach e it")
    names.forEach { println(it) }

    println("---------------------------")

    /** é inferido o tipo do arrayOf como String */
    val namesOf = arrayOf("Julia", "Nucell", "Sabrina", "Joao")
    namesOf.sort()
    println("Imprimindo os nomes usando arrayOf")
    namesOf.forEach { println(it) }
}