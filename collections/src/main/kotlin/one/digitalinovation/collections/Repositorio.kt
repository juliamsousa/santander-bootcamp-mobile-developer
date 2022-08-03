package one.digitalinovation.collections

class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun create (id: String, value: T) {
        map[id] = value
    }

    fun remove(id: String) = map.remove(id)

    fun findById(id: String) = map[id]

    // retorna todos os valores contidos no map
    fun findAll() = map.values
}