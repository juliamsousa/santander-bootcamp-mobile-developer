package one.digitalinovation.collections

fun main() {
    // o intArrayOf permite criar um array com valores pré definidos
    // com isso nao estamos presos ao tamanho do array
    val arrayOf = intArrayOf(1, 3, 34, 1, 3, 445, 2)

    println("Imprimindo o intArrayOf")
    arrayOf.forEach{int ->
        println(int)
    }

    arrayOf.sort()

    println("---------------------------")

    println("Imprimindo o intArrayOf após ordenacao")
    arrayOf.forEach{int ->
        println(int)
    }
}