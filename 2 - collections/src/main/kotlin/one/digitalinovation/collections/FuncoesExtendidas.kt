package one.digitalinovation.collections

/***
 * podemos criar funcoes extendidas para operar em cima dos valores de nossas collections
 */

fun main() {
    val salarios = arrayOf(
        "20000".toBigDecimal(),
        "50000".toBigDecimal(),
        "4000".toBigDecimal()
    )

    val total = salarios.somatoria()
    val mediaSalarial = salarios.media()

    println("---------------------------")
    println("Total dos salarios: ${total}")
    println("Media dos salarios: ${media}")
    println("---------------------------")
}