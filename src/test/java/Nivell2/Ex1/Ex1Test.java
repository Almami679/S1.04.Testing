package Nivell2.Ex1;

import org.junit.Test;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Ex1Test {

    @DisplayName("Demostrar si dos numeros son iguales")
    @Test
    public void TestIgualdad(){
        int num1 = 1;
        int num2 = 1;
        assertThat(num1).isEqualTo(num2);
    }

    @DisplayName("Demostrar si dos numeros son iguales")
    @Test
    public void TestDesigualdad(){
        int num1 = 1;
        int num2 = 2;
        assertThat(num2).isNotEqualTo(num1);
    }


}