package Nivell2.Ex6;

import org.junit.Test;

import static Nivell2.Ex6.Ex6.indexOutOfBounds;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

public class Ex6Test {

    @Test
    public void testExceptin() {
        assertThatThrownBy(() -> {
            indexOutOfBounds(4);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("Index 4 out of bounds for length 3");

        assertDoesNotThrow(() -> {
            indexOutOfBounds(1);
        });

    }

}