package Nivell2.Ex2;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class Ex2Test {

    @DisplayName("Demostrar si dos Objetos son iguales")
    @Test
    public void TestIgualdadObjetos(){
        Ex2 objeto1 = new Ex2("Albert Marin", 35);
        Ex2 objeto2 = new Ex2("Albert Marin", 35);
        assertThat(objeto1).isEqualTo(objeto2);

    }




}