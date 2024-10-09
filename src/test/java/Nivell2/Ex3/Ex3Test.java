package Nivell2.Ex3;


import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class Ex3Test {

    @DisplayName("Test igualdad dos arrays de enteros")
    @Test

    public void testIgualdadArrays() {
        int[] numeros = {1,2,3,4};
        int[] numeros2 = {1,2,3,4};
        assertThat(numeros).isEqualTo(numeros2);
    }

}
