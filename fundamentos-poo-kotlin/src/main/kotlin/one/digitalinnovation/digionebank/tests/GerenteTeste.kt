package one.digitalinnovation.digionebank.tests
import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.Funcionario

fun gerenteTeste() {
    val julia = Gerente(nome = "Julia", CPF = "123.456.789-00", salario = 1231231)
    val juliana = Gerente(nome = "Julia", CPF = "123.456.789-00", salario = 21312213)

    imprimeRelatorioGerente(julia)
    imprimeRelatorioGerente(juliana)
}

fun imprimeRelatorioGerente(funcionario: Funcionario) = println(funcionario.toString())
