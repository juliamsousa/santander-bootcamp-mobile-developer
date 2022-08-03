package one.digitalinovation.collections

/***
 * - uma collection é mutable porque permite fazer alteracoes nela
 * - de modo geral as collections da kotlin api nao sao mutaveis
 */

fun main () {
    val julia = Funcionario(nome = "Julia", salario = 5500.00, tipo = "CLT")
    val nucell = Funcionario(nome = "Myllene", salario = 17500.00, tipo = "PJ")
    val joao = Funcionario(nome = "Joao", salario = 6500.00, tipo = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 2100.00, tipo = "CLT")

    val funcionarios = mutableListOf(julia, nucell, joao)

    println("---------------------------")
    print("Imprimindo os funcionarios apos criacao")
    funcionarios.forEach { println(it) }
    println("---------------------------")

    funcionarios.remove(joao)
    funcionarios.add(pedro)

    print("Imprimindo os funcionarios da mutable list apos mudancas")
    funcionarios.forEach { println(it) }
    println("---------------------------")

    val mtbSet = mutableSetOf(joao)

    mtbSet.add(nucell)
    mtbSet.add(julia)

    print("Imprimindo os funcionarios do mutable set apos mudancas")
    mtbSet.forEach { println(it) }
    println("---------------------------")
}