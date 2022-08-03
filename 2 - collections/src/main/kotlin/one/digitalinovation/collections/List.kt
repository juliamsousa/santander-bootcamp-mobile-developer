package one.digitalinovation.collections

data class Funcionario (val nome: String, val salario: Double, val tipo: String) {
    override fun toString(): String = """
        
        Nome: ${nome}
        Salario: ${salario}
        Contratacao ${tipo}
        
    """.trimIndent()
}

fun main () {
    val julia = Funcionario(nome="Julia", salario=5500.00, tipo="CLT")
    val nucell = Funcionario(nome="Myllene", salario=17500.00, tipo="PJ")
    val joao = Funcionario(nome="Joao", salario=6500.00, tipo="CLT")

    val funcionarios = listOf(julia, nucell, joao)

    print("Imprimindo os funcionarios apos criacao")
    funcionarios.forEach { println(it)}
    println("---------------------------")

    // o sorted by permite utilizar um atributo para ordenar

    print("Imprimindo os funcionarios apos ordenacao por salario")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it)}
    funcionarios
    println("---------------------------")

    print("Imprimindo os funcionarios apos agrupar")
    // podemos agrupar dados de acordo com valores de atributos iguais
    funcionarios
        .groupBy { it.tipo }
        .forEach { println(it)}
    funcionarios
    println("---------------------------")
}