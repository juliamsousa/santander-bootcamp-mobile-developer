package one.digitalinnovation.digionebank

abstract class Funcionario(
    override val nome: String,
    override val CPF: String,
    val salario: Long
) : Pessoa(nome, CPF) {
    protected abstract fun calculaImpostos() : Double

    override fun toString(): String = """
        Nome: $nome
        CPF: $CPF
        Salario: $salario
        Imposto: ${calculaImpostos()}
    """.trimIndent()
}