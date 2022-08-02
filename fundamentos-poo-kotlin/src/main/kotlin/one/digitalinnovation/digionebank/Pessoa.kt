package one.digitalinnovation.digionebank

abstract class Pessoa(
    open val nome: String = "Julia",
    open val CPF: String = "123.456.789-00"
) {
    fun getInformacoesPessoa() = "$nome e $CPF"

    // private set
    // com isso deixamos apenas a funcao set do CPF como private
    /*
          podemos representar o endereço como uma inner class
          mas nem sempre esse recurso é recomendado
          inner class Endereco {
              ...
          }
       */

    /*
      a data class permite criar objetos de modo que após
      instanciados não podem ter seu estado alterado
     */
}
