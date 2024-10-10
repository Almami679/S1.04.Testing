package Nivell1.Ex1.Modules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

import static Nivell1.Ex1.Main.Main.*;

public class Libro {

    private static int idSiguiente = 0;

    private String titulo;
    private int id;
    private int numCopia;

    public Libro(String titulo, int numCopia) {
        this.titulo = titulo;
        this.numCopia = numCopia;
        this.id = idSiguiente + 1;
    }

    //Getters

    public String getTitulo() {
        return this.titulo;
    }

    public int getNumCopia() {
        return this.numCopia;
    }

    public int getId() {
        return this.numCopia;
    }

    //toString

    public String toString() {
        return "Libro: " + this.titulo + " " +
                "(Num de copia: " + this.numCopia + ") [ID: " + this.id + "]";
    }

    //Metodos Propios


    public static boolean libroRepetido(Libro libro) {
        boolean output = false;
        for (Libro otro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(otro.titulo) && (libro.getId() == otro.id)) {
                output = true;
            }
        }
        return output;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    public int compare(Libro obj1, Libro obj2) {
        return obj1.getTitulo().compareTo(obj2.getTitulo());
    }



    public static void addBook(Libro libro) {
        if (!libroRepetido(libro)) {
            libros.add(libro);
            System.out.println(libro.toString() + " Añadido correctamente.");
        } else {
            System.out.println(libro.toString() + " ya consta en la base de datos.");
        }
        ordenarAZ();
    }

    public static String getLibros() {
        String output = "";
        for (Libro libro : libros) {
            output = libro.toString();
        }
        return output;
    }

    public static ArrayList<Integer> buscarLibro(Libro libro) {
        ArrayList<Integer> posiciones = new ArrayList<>();
        boolean encontrado = false;
        int pos = 0;
        while (pos <= libros.size()) {
            if (libros.get(pos).getTitulo().equalsIgnoreCase(libro.getTitulo())) {
                posiciones.addLast(pos);
                encontrado = true;

            } else {
                pos++;
            }
        }
        if (!encontrado) {
            System.out.println("Libro no encontrado");
            posiciones.add(-1);
        }
        return posiciones;
    }

    public static String LibroByPos(ArrayList<Integer> posiciones) {
        String output = "";
        if (posiciones.getFirst() != -1) {
            for (int pos : posiciones)
                output =  libros.get(pos).toString();
        }
        return output;
    }

    public static void addLibroByPos(int pos, Libro libro) {
        if (!libroRepetido(libro)) {
            libros.add(pos, libro);
            System.out.println(libro.toString() + " Añadido correctamente en la posicion " + pos);
        } else {
            System.out.println(libro.toString() + " ya consta en la base de datos.");
        }
    }

    public static ArrayList<Integer> buscarLibrosPorNombre(String titulo) {
        ArrayList<Integer> posiciones = new ArrayList<>();
        boolean encontrado = false;
        int pos = 0;
        while (pos <= libros.size()) {
            if (libros.get(pos).getTitulo().equalsIgnoreCase(titulo)) {
                posiciones.addLast(pos);
                encontrado = true;

            } else {
                pos++;
            }
        }
        if (!encontrado) {
            System.out.println("Libro no encontrado");
            posiciones.add(-1);
        }
        return posiciones;

    }
    public static void deleteLibroByName(String titulo) {
                for(int pos = 0; pos < libros.size(); pos++){
                    if(libros.get(pos).getTitulo().equalsIgnoreCase(titulo))
                        System.out.println(titulo + "Copia " + libros.get(pos).getNumCopia() + " Eliminado");
                        libros.remove(libros.get(pos));
        }
    }

    public static void ordenarAZ() {
        libros.sort(Comparator.comparing(Libro::getTitulo));
    }
}
