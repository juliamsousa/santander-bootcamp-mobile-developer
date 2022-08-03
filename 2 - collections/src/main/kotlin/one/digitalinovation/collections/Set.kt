package one.digitalinovation.collections

data class FuncionarioSet (val nome: String, val salario: Double, val tipo: String) {
    override fun toString(): String = """
        
        Nome: ${nome}
        Salario: ${salario}
        Contratacao ${tipo}
        
    """.trimIndent()
}

/**
 * - o set permite aplicar operacoes de conjunto com os dados
 * - union, subtract, intersect
 * */
fun main () {
    val julia = FuncionarioSet(nome = "Julia", salario = 5500.00, tipo = "CLT")
    val nucell = FuncionarioSet(nome = "Myllene", salario = 17500.00, tipo = "PJ")
    val joao = FuncionarioSet(nome = "Joao", salario = 6500.00, tipo = "CLT")

    val funcionarias = setOf(julia, nucell)
    val funcionarios = setOf(joao, julia)

    val quadro = funcionarios.union(funcionarias)

    println("Imprimindo apos uniao")
    quadro.forEach { println(it) }
    println("---------------------------")

    val reducao = funcionarias.subtract(funcionarios)

    println("Imprimindo apos subtracao")
    reducao.forEach { println(it) }
    println("---------------------------")

    val intersecao = funcionarias.intersect(funcionarios)

    println("Imprimindo apos intersecao")
    intersecao.forEach { println(it) }
    println("---------------------------")
}