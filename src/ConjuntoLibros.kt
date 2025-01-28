import ConjuntoLibros.Companion.librosAlmacenados

class ConjuntoLibros(val libros: Array<Libro?>) {

    companion object{
        val librosAlmacenados = Array(5) { "" }
        var indiceActual: Int = 0
    }
    fun añadirLibro(libro: Libro) {

        if (indiceActual < librosAlmacenados.size) {
            libros[indiceActual] = libro
            indiceActual++
        }else{
            println("No hay espacio suficiente")
        }

    }
    /*fun borrarLibroAutor(autor: String) {
        for (i in libros.indices) {
            if (libros[i] == autor) {

            }
        }
    }

     */

    fun mostrarLibros() {
        println("Libros almacenados:")
        libros.filterNotNull().forEach {
            println("${it.titulo} - ${it.autor} - ${it.numeroPaginas} páginas - Calificación: ${it.calificacion}")
        }
    }
}



