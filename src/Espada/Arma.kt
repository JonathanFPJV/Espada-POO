package Espada

abstract class Arma(val nombre: String, val danio: Int) {
    // Bloque init para inicialización
    init {
        println("Creando un arma: $nombre con $danio de daño.")
    }

    abstract fun atacar()
    open fun mostrarInfo() {
        println("Arma: $nombre, Daño: $danio")
    }
}
