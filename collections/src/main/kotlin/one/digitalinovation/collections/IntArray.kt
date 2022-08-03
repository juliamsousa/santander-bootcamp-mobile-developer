package one.digitalinovation.collections

fun main() {
    val intArray = IntArray(size= 5)
    intArray[0] = 1
    intArray[1] = 3
    intArray[2] = 13
    intArray[3] = 112
    intArray[4] = 14

    // utilizando iteração tradicional
    println("Imprimindo com o for: ")
    for (int in intArray) {
        println(int)
    }

    println("---------------------------")

    println("Imprimindo com o forEach: ")
    // utilizando funcao lambda
    intArray.forEach { valor ->
        println(valor)
    }

    // iteramos sobre os indices e não sobre os valores do array

    println("---------------------------")

    println("Imprimindo com índices: ")
    for (index in intArray.indices) {
        println(intArray[index])
    }

    intArray.sort()

    println("---------------------------")

    println("Imprimindo após sort: ")
    // utilizando funcao lambda
    intArray.forEach { valor ->
        println(valor)
    }
}