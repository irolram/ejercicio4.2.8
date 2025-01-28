fun main(){
    val libro1 = Libro("El nene del sotano", "Rodolfo", 100, 6)

    val conjunto = ConjuntoLibros(arrayOfNulls<Libro>(5))

    conjunto.añadirLibro(libro1)

    conjunto.mostrarLibros()

}