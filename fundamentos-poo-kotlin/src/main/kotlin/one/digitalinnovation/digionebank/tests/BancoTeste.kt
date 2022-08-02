package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.Banco

fun bancoTeste() {
    val digiOneBank = Banco(nome = "Digi One Bank", numero = 12)
    // após ser instanciado esse objeto nao pode ter seus estados modificados
    val banco2 = digiOneBank.copy(nome = "Banco2")
    // criando uma cópia é possivel criar um objeto com estados diferentes
    println("${digiOneBank.nome} e ${digiOneBank.numero}")
    println("${banco2.nome} e ${banco2.numero}")
}