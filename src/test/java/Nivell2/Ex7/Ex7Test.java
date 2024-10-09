package Nivell2.Ex7;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class Ex7Test {

    @Test

    public void testNull() {
        Object objetoNull = null;
        assertThat(objetoNull).isNull();
    }

}