package one.digitalinnovation.digionebank.tests
import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun analistaTeste() {
    val julia = Analista(nome = "Julia", CPF = "123.456.789-00", salario = 1231231)
    val juliana = Analista(nome = "Julia", CPF = "123.456.789-00", salario = 21312213)

    imprimeRelatorio(julia)
    imprimeRelatorio(juliana)
}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())
