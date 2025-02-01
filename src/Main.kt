fun main(){
    val libro1 = Libro("El nene del sotano", "Rodolfo", 100, 6)

    val libro2 = Libro("La leyenda de las tierras rarunas", "Folagor04",  289, 4)

    val libro3 = Libro("La historia terminable", "Yo", 800, 8)

    val conjutos = ConjuntoLibros()

    conjutos.aniadirLibro(libro1)
    conjutos.aniadirLibro(libro2)

    conjutos.eliminarLibroAutor("Rodolfo")
    conjutos.eliminarLibroTitulo("La leyenda de las tierras rarunas")

    conjutos.aniadirLibro(libro3)
    conjutos.aniadirLibro(libro2)
    conjutos.aniadirLibro(libro1)

    conjutos.mostrarLibrosOrdenado()

    println("====================================================")

    conjutos.mostrarTolosLibros()



}