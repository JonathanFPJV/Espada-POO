package Espada

open class Espada(nombre: String, danio: Int, val durabilidad: Int) : Arma(nombre, danio), Reparar {

    init { println("Espada $nombre con durabilidad $durabilidad creada.") }

    override fun atacar() {
        println("$nombre realiza un ataque causando $danio puntos de daño.")
    }

    override fun mostrarInfo() {
        super.mostrarInfo()
        println("Durabilidad: $durabilidad")
    }

    override fun reparar() {
        println("$nombre ha sido reparada a su durabilidad original.")
    }
}
class EspadaMagica(nombre: String, danio: Int, durabilidad: Int, val poderMagico: Int) :
    Espada(nombre, danio, durabilidad) {

    init {
        println("Espada Mágica $nombre con poder mágico $poderMagico creada.")
    }

    override fun atacar() {
        super.atacar()
        println("El poder mágico de $poderMagico se activa aumentando el daño total.")
    }

    override fun mostrarInfo() {
        super.mostrarInfo()
        println("Poder Mágico: $poderMagico")
    }
}


