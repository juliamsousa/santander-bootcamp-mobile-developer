package one.digitalinovation.collections

fun main() {
    val salarios = DoubleArray(size = 3)
    salarios[0] = 322423.0
    salarios[1] = 3231.0
    salarios[2] = 54354.0

    println("Imprimindo com o forEach")
    salarios.forEach { println(it)}

    println("---------------------------")

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.2
    }

    println("Imprimindo salarios apos aumento")
    salarios.forEach { println(it) }

    println("---------------------------")

    val bonus = doubleArrayOf(123.34, 42234.13, 5453.2)

    bonus.sort()
    println("Imprimindo o doubleArrayOf de bonus")
    bonus.forEach { println(it) }
}