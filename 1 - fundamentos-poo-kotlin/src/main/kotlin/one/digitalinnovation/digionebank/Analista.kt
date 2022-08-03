package one.digitalinnovation.digionebank

class Analista(
    nome: String,
    CPF: String,
    salario: Long) :
    Funcionario (nome, CPF, salario) {
    override fun calculaImpostos() = salario * 0.1
}