package Nivell2.Ex2;

import java.util.Objects;

public class Ex2 {

    private String nombre;
    private int edad;

    public Ex2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ex2 ex2 = (Ex2) o;
        return edad == ex2.edad && Objects.equals(nombre, ex2.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }
}
