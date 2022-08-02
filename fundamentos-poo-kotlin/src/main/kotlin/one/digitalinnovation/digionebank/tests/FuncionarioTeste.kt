package one.digitalinnovation.digionebank.tests
import one.digitalinnovation.digionebank.Pessoa
import one.digitalinnovation.digionebank.Funcionario

fun funcionarioTeste() {
    val julia = Pessoa(nome = "Julia", CPF = "123.456.789-00")
    println("${julia.nome} - ${julia.CPF}")

    val juliana = Funcionario(nome = "Julia", CPF = "123.456.789-00", salario = 21312213)
    println("${juliana.nome} - ${juliana.CPF}")
}