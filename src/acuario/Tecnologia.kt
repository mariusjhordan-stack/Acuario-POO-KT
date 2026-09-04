package acuario

interface Conectable {
    fun conectarInternet()
}

abstract class Dispositivo {
    abstract val categoria: String
}

open class Computadora(open var marca: String = "Generic", open var ram: Int = 8, open var almacenamiento: Int = 256) : Dispositivo(), Conectable {

    override val categoria = "Cómputo"
    init {
        println("Fabricando dispositivo de la marca: $marca")
    }
    constructor(marcaEspecifica: String) : this() {
        marca = marcaEspecifica
        ram = 16
    }
    open var almacenamientoTb: Double
        get() = almacenamiento / 1024.0
        set(valor) {
            almacenamiento = (valor * 1024).toInt()
        }
    override fun conectarInternet() {
        println("Dispositivo $marca conectado a la red Wi-Fi local.")
    }
    open fun mostrarFicha() {
        println("Categoría: $categoria | Marca: $marca | RAM: $ram GB | Disco: $almacenamientoTb TB")
    }
}
class LaptopGamer(override var marca: String, override var ram: Int, var tarjetaGrafica: String) : Computadora(marca, ram) {
    override val categoria = "Portátil de Alto Rendimiento"
    override fun conectarInternet() {
        println("¡Conexión Gamer activada en la Laptop $marca! Latencia optimizada para jugar.")
    }
}

