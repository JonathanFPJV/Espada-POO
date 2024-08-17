package Espada

fun gestionarInventarioDeEspadas() {
    // Crear espadas con diferentes configuraciones
    val espadaBasica = Espada("Espada de Hierro", 10, 100)
    espadaBasica.mostrarInfo()

    val espadaMagica = EspadaMagica("Espada de Fuego", 15, 80, 25)
    espadaMagica.mostrarInfo()

    // Simulación de inventario y operaciones
    val inventarioEspadas = mutableListOf<Espada>()
    inventarioEspadas.add(espadaBasica)
    inventarioEspadas.add(espadaMagica)

    println("\n--- Simulación de Ataques ---")
    for (espada in inventarioEspadas) {
        espada.atacar()
        println("------------------------")
    }

    println("\n--- Reparando Espadas ---")
    for (espada in inventarioEspadas) {
        espada.reparar()
        println("------------------------")
    }

}
fun main() {
    gestionarInventarioDeEspadas()
}
