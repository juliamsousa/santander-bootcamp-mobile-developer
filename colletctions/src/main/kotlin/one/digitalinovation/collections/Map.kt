package one.digitalinovation.collections

/***
 * o mapa é uma colecao composta por uma chave e seu valor
 */

fun main() {
    val pair: Pair<String, Double> = Pair("Joao", 1000.0)
    val map = mapOf(pair)

    map.forEach {(k, v) -> println("Chave: ${k} - Valor: ${v}")}

    val infixMap = mapOf(
        "Pedro" to 2000.0,
        "Maria" to 3500.0
    )

    infixMap.forEach {(k, v) -> println("Chave: ${k} - Valor: ${v}")}
}