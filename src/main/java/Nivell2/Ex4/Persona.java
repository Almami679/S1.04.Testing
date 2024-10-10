package Nivell2.Ex4;

import java.util.ArrayList;
import java.util.Objects;

public class Persona {
    public static ArrayList<Persona> personasClass = new ArrayList<Persona>();
    String nom;
    int edad;


    public Persona(String nom, int edad) {
        this.nom = nom;
        this.edad = edad;

    }
    public void crearPersona(Persona persona){
        personasClass.add(persona);
    }

    public String getNom() {
        return this.nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad && Objects.equals(nom, persona.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }
}
