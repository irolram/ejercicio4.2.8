data class Libro(val titulo: String, val autor: String, val numeroPaginas: Int, val calificacion: Int) {

    init {
        require(calificacion in 0..10) { "La calificación debe estar entre 0 y 10" }
    }

    override fun toString(): String {
        return "Libro(título='$titulo', autor='$autor', páginas=$numeroPaginas, calificación=$calificacion)"
    }
}