

class ConjuntoLibros() {

    val libros: MutableSet<Libro> = mutableSetOf<Libro>()


    companion object{
            val MAX_LIBROS = 5
    }



    fun aniadirLibro(libro: Libro){
        if(libros.size < MAX_LIBROS ){
            libros.add(libro)
        }else{
            println("No hay más espacio")
        }

    }
    fun eliminarLibroAutor(autor: String){

        var libroPaEliminar: Libro? = null

        for(libro in libros){
            if(libro.autor == autor){
                libroPaEliminar = libro
            }
        }
        libros.remove(libroPaEliminar)
    }
    fun eliminarLibroTitulo(titulo: String){

        var libroPaEliminar: Libro? = null

        for(libro in libros){
            if(libro.titulo == titulo){
                libroPaEliminar = libro
            }
        }

        libros.remove(libroPaEliminar)
    }
    fun mostrarLibrosOrdenado(){

        val ordenadaCali : List<Libro> = libros.sortedByDescending { libro -> libro.calificacion }

        for (libro in ordenadaCali){
            println(libro)
        }
    }

    fun mostrarTolosLibros(){

        for (libro in libros){
            println(libro)
        }
    }

}



