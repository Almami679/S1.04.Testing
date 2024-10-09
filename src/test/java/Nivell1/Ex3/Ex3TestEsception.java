package Nivell1.Ex3;


import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Ex3TestEsception {

    @DisplayName("Test del ejercicio 3, capturando una exception IndexOutOfBounds")

    @Test
    public void testOutOfBoundsExceptionEx3Nivell1() throws IndexOutOfBoundsException {
        String messageException = "No existe esa posicion en la lista";
        IndexOutOfBoundsException e = assertThrows(IndexOutOfBoundsException.class, Ex3::getValorFueraDeRango);
        assertEquals(e.getMessage(), messageException);
    }

    @DisplayName("Prueba poniendolo en Expected y llamando solo a la funcion, sin un assert")

    @Test(expected = IndexOutOfBoundsException.class)
    public void testOutOfBoundsException() throws IndexOutOfBoundsException {
        Ex3.getValorFueraDeRango();

    }


}