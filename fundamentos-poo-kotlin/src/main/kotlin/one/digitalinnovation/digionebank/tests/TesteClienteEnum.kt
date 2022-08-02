package one.digitalinnovation.digionebank.tests

import one.digitalinnovation.digionebank.ClienteTipo

fun clientTipoTeste() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    val pj = ClienteTipo.PJ

    println("${pf.name} - ${pf.descricao}")
    println("${pj.name} - ${pj.descricao}")
}