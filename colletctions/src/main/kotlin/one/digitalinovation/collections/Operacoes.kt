package one.digitalinovation.collections

fun main () {
    /**
     * - teste de algumas operacoes em arrays
     * - max, min, average, filter
     * - count, find, any
     * - max e min estao deprecados, deve-se utilizar o orNull para ambos os casos
     * */

    val salarios = DoubleArray(size = 3)
    salarios[0] = 322423.0
    salarios[1] = 3250.0
    salarios[2] = 54354.0

    println("---------------------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")
    println("---------------------------")

    // para filtrarmos é necessario passar uma condicao (predicado)
    val salariosFiltrados = salarios.filter { it > 2500}
    println("Salarios fitlrados")
    salariosFiltrados.forEach {println(it)}
    println("---------------------------")

    println("Utilizando a funcao count utilizando um range para verificacao")
    println("Salarios na faixa de 2000 - 5000: ${salarios.count { it in 2000.0 .. 5000.0}}")
    println("---------------------------")

    // nesse caso busca um elemento especifico
    println("Utilizando a funcao find")
    println("Salario buscado (3250.0): ${salarios.find {it == 3250.0}}")
    println("---------------------------")

    // nesse caso encontra qualquer elemento e retorna um boolean
    println("Utilizando a funcao any")
    println("Existe algum salario maior que 2000: ${salarios.any {it > 2000}}")
    println("---------------------------")

}