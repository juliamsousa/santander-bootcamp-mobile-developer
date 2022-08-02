package one.digitalinnovation.digionebank

class Gerente(
    nome: String,
    CPF: String,
    salario: Long,
    senha: String) :
    Funcionario(nome = nome, CPF = CPF, salario = salario),
    Logavel {
    override fun calculaImpostos(): Double = salario * 0.4
    override fun login(senha: String): Boolean = "senha123" == senha
}