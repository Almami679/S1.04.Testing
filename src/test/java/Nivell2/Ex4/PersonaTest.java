package Nivell2.Ex4;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.HashSet;
import java.util.Set;

import static Nivell2.Ex4.Persona.personasClass;
import static jdk.internal.org.commonmark.parser.block.BlockContinue.atIndex;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertAll;

public class PersonaTest {

    @DisplayName("Check de si la array tiene los objetos en orden de creacion," +
            "y si el hash los tiene desordenados")
    @Test
    public void testOrdenArray() {
        Persona primerAdd = new Persona("Albert Marin", 35);
        Persona segundoAdd = new Persona("Irene Marin", 32);
        Persona tercerAdd = new Persona("Juan Marin", 61);
        Persona cuartoAdd = new Persona("Pilar Miranda", 62);
        Persona[] personas = {primerAdd, segundoAdd, tercerAdd, cuartoAdd};
        assertThat(personas).containsExactly(primerAdd, segundoAdd, tercerAdd, cuartoAdd);
    }

    @DisplayName("Check de si la array tiene los objetos")
    @Test

    public void testContainsArray(){
        Persona primerAdd = new Persona("Albert Marin", 35);
        Persona segundoAdd = new Persona("Irene Marin", 32);
        Persona tercerAdd = new Persona("Juan Marin", 61);
        Persona cuartoAdd = new Persona("Pilar Miranda", 62);
        Persona[] personas = {primerAdd, segundoAdd, tercerAdd, cuartoAdd};

        assertThat(personas).containsExactlyInAnyOrder(primerAdd, segundoAdd, tercerAdd, cuartoAdd);
    }

    @DisplayName("Check de si la array no tiene un objeto repetido " +
            "ni uno sin añadir ")
    @Test

    public void testNotContainsArray(){
        Set<Persona> personas = new HashSet<>();
        Persona primerAdd = new Persona("Albert Marin", 35);
        Persona segundoAdd = new Persona("Irene Marin", 32);
        Persona noAñadido = new Persona("Juan Marin", 61);
        Persona cuartoAdd = new Persona("Pilar Miranda", 62);
        Persona repetido = new Persona("Albert Marin", 35);
        personas.add(primerAdd);
        personas.add(segundoAdd);
        personas.add(cuartoAdd);
        personas.add(repetido);
        assertThat(personas).doesNotContain(noAñadido);
        assertThat(personas).doesNotHaveDuplicates();

    }


}