package one.digitalinnovation.digionebank

class Conta(
    val agencia: String,
    val numero: String,
    val saldo: Long
    ) {
    // construtor primario após instanciado os valores nao podem mudar por ser val
    fun deposito(valor: Long) {

    }

    fun saque(valor: Long){

    }
}