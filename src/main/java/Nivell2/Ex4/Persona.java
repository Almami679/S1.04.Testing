package Nivell2.Ex4;

import java.util.Objects;

public class Persona {

    String nom;
    int edad;
    int id;
    static int idSiguiente= 1;

    public Persona(String nom, int edad) {
        this.nom = nom;
        this.edad = edad;
        this.id = idSiguiente;
        id++;

    }

    public String getNom() {
        return this.nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && id == persona.id && Objects.equals(nom, persona.nom);
    }

    @Override
    public int hashCode() {
        return id;
    }
}
