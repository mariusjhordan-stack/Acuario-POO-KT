package acuario


interface AccionPez {
    fun Comer()
}


abstract class Pez {
    abstract val color: String
}
class Tiburon : Pez(), AccionPez {
    override val color = "gris"

    override fun Comer(){
        println("cazar y comer peces")
    }
}

class PezPayaso : Pez(), AccionPez {
    override val color = "dorado"

    override fun Comer(){
        println("comer algas")
    }
}


