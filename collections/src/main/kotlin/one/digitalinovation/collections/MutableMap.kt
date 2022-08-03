package one.digitalinovation.collections

fun main() {
    val julia = Funcionario(nome = "Julia", salario = 5500.00, tipo = "CLT")
    val nucell = Funcionario(nome = "Myllene", salario = 17500.00, tipo = "PJ")
    val joao = Funcionario(nome = "Joao", salario = 6500.00, tipo = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 2100.00, tipo = "CLT")

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(julia.nome, julia)
    repositorio.create(joao.nome, joao)
    repositorio.create(nucell.nome, nucell)

    println("---------------------------")
    println("Encontrando um funcionario por id: ${repositorio.findById(julia.nome)}")
    println("---------------------------")

    println("Imprimindo todos os funcionarios")
    repositorio.findAll().forEach{ println(it) }
    println("---------------------------")

    println("Imprimindo todos os funcionarios apos remocao")
    repositorio.remove(julia.nome)
    repositorio.findAll().forEach{ println(it) }
    println("---------------------------")
}