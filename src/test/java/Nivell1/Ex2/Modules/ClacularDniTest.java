package Nivell1.Ex2.Modules;

import Nivell1.Ex3.Ex3;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static Nivell1.Ex2.Modules.ClacularDni.*;
import static java.lang.Integer.parseInt;
import static org.junit.jupiter.api.Assertions.*;

public class ClacularDniTest {

    @DisplayName("Test para probar de introducir un numero erroneo con letras")

    @Test
    public void testIntroducirNumeroDniErroneoConLetras() throws NumeroIncorrectoDniException {
        String dniConLetras = "hfun3545";
        int returnPorDefecto = 0;
        int resultado = ClacularDni.pedirDni(dniConLetras);
        assertEquals(returnPorDefecto, resultado);
    }

    @DisplayName("Test para probar de introducir un numero erroneo mas grande de size 8")

    @Test
    public void testIntroducirDniErroneoConMasDe8Caracteres() throws NumeroIncorrectoDniException {
        String dniMasDe8Caracteres = "764846937497";
        int returnPorDefecto = 0;
        int resultado = ClacularDni.pedirDni(dniMasDe8Caracteres);
        assertEquals(returnPorDefecto, resultado);
    }

    @DisplayName("Test para probar de introducir un numero correcto")

    @Test
    public void testIntroducirDniCorrecto() throws NumeroIncorrectoDniException {
        String dniCorrecto = "53082293";
        int dni1 = pedirDni(dniCorrecto);
        assertEquals(parseInt(dniCorrecto),dni1);
    }

    @DisplayName("Test para probar de introducir 10 numeros correctos")

    @ParameterizedTest
    @CsvSource({
            "'53082293', 'H'",
            "'84383028', 'F'",
            "'63733322', 'T'",
            "'87908422', 'F'",
            "'13506423', 'H'",
            "'35556429', 'Q'",
            "'13931554', 'V'",
            "'14199283', 'A'",
            "'58362621', 'Y'",
            "'27053944', 'X'",

    })
    public void test10resultadosCorrectos(String num, String letra) {
        String letraDni = calcularDni(parseInt(num));
        assertEquals(letra, letraDni);

    }

}