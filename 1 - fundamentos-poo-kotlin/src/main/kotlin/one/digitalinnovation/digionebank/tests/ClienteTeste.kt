package one.digitalinnovation.digionebank.tests
import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun clienteTeste() {
    val julia = Cliente(
        nome = "Julia",
        CPF = "123.456.789-00",
        senha = "1231231",
        clienteTipo = ClienteTipo.PJ
    )

    AutenticacaoTeste().autentica(julia)
}
