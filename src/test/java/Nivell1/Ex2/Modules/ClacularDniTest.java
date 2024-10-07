package Nivell1.Ex2.Modules;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static Nivell1.Ex2.Modules.ClacularDni.pedirDni;
import static java.lang.Integer.parseInt;
import static org.junit.jupiter.api.Assertions.*;

public class ClacularDniTest {

    @Test
    public void testIntroducirNumeroDniErroneoConLetras() {
        String messageException = "El numero introducido no concuerda con un numero real de DNI";
        String dniConLetras = "hfun3545";
        NumeroIncorrectoDniException e = assertThrows(NumeroIncorrectoDniException.class,
                () -> {pedirDni(dniConLetras);
        });
        assertEquals(messageException, e.getMessage());
    }

    @Test
    public void testIntroducirDniErroneoConMasDe8Caracteres() {
        String dniMasDe8Caracteres = "764846937497";
        String messageException = "El numero introducido no concuerda con un numero real de DNI";
        String dniConLetras = "hfun3545";
        NumeroIncorrectoDniException e = assertThrows(NumeroIncorrectoDniException.class,
                () -> {pedirDni(dniConLetras);
                });
        assertEquals(messageException, e.getMessage());
    }

    @Test
    public void testIntroducirDniCorrecto() throws NumeroIncorrectoDniException {
        String dniCorrecto = "53082293";
        int dni1 = pedirDni(dniCorrecto);
        assertEquals(parseInt(dniCorrecto),dni1);
    }

}