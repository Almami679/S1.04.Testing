package Nivell1.Ex1.Modules;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;


import static Nivell1.Ex1.Main.Main.libros;
import static Nivell1.Ex1.Modules.Libro.*;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {

    @DisplayName("Dado un libro, lo añadimos y comprovamos si la lista" +
            "no es null")
    @Test
    public void testListaNull(){

        assertNotNull(libros, "La lista es Null");
    }

    @DisplayName("Confirmamos que la lista tiene una medida " +
            "esperada despues de añadir objetos")
    @Test
    public void testComprobarSizeDeLista() {
        int sizeEsperado = 3;
        addBook(new Libro("libroPrueba", 1));
        addBook(new Libro("libroPrueba2", 1));
        addBook(new Libro("libroPrueba3", 1));
        assertEquals(sizeEsperado, libros.size(), "Size inesperado");
    }

    @DisplayName("Confirmamos que el objeto se agrega en la posicion correcta" +
            "de la lista")
    @Test
    public void posicionCorrectaDeLibroEnLista() {
        Libro libroPos2 = new Libro("LibroPruebaPos2", 1);
        addBook(new Libro("libroPrueba", 1));
        addBook(new Libro("libroPrueba2", 1));
        addBook(new Libro("libroPrueba3", 1));
        addLibroByPos(2, libroPos2);
        assertEquals(libroPos2, libros.get(2));
    }

    @DisplayName("Test para verificar que no se añaden objetos duplicados")

    @Test
    public void checkLibrosDupicados() {
        int sizeEsperada = 2;
        addBook(new Libro("libroPrueba", 1));
        addBook(new Libro("libroPrueba2", 1));
        addBook(new Libro("libroPrueba2", 1));
        assertEquals(sizeEsperada, libros.size());
    }

    @DisplayName("Test para comprobar objetos correctos en la posicion esperada")
    @Test
    public void checkReturnLibroByPos() {
        Libro libroEsperado = new Libro("libroPrueba2", 1);
        int posEsperada = 1;
        addBook(new Libro("libroPrueba", 1));
        addBook(libroEsperado);
        addBook(new Libro("libroPrueba3", 1));
        assertEquals(libroEsperado.toString(), libros.get(posEsperada).toString());
    }

    @DisplayName("Nos aseguramos que la lista este correcta en el transcurso de " +
            "añadir objetos")
    @Test
    public void checkAñadirLibroSobreElTamañoDeLaLista() {
        int tamanoEsperado = 3;
        addBook(new Libro("libroPrueba", 1));
        addBook(new Libro("libroPrueba2", 1));
        addBook(new Libro("libroPrueba3", 1));
        assertEquals(tamanoEsperado, libros.size());
    }

    @DisplayName("Test para calcular el tamaño de la lista despues" +
            "de eliminar objetos, me da error de out of memory Error")
    @Test
    public void checkEliminiarLibrosRespectoAlSizeDeLaLista() {
            int tamanoEsperado = 1;
            addBook(new Libro("libroPrueba2", 1));
            addBook(new Libro("libroPrueba", 1));
            deleteLibroByName("libroPrueba");
            assertEquals(tamanoEsperado, libros.size());

    }

    @Test
    public void checkComprobarOrdenAZ() {
        String tituloPrimerLibroDeLaLista = "a";
        String tituloUltimoLibroDeLaLista = "z";
        addBook(new Libro("c", 1));
        addBook(new Libro("a", 1));
        addBook(new Libro("z", 1));
        addBook(new Libro("d", 1));
        addBook(new Libro("b", 1));
        assertEquals(tituloPrimerLibroDeLaLista, libros.getFirst().getTitulo());
        assertEquals(tituloUltimoLibroDeLaLista, libros.getLast().getTitulo());
    }


}