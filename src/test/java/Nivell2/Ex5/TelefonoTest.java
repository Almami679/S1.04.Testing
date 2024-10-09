package Nivell2.Ex5;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import static jdk.internal.org.commonmark.parser.block.BlockContinue.atIndex;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class TelefonoTest {

    @DisplayName("Test de map y una de las Key")
    @Test
    public void testMap() {
        Map<Integer, Telefono> telefonos = new HashMap<>();

        Telefono t1 = new Telefono("Marta", 677549875);
        Telefono t2 = new Telefono("Oscar", 465553776);
        Telefono t3 = new Telefono("Xavi", 443009263);
        telefonos.put(1, t1);
        telefonos.put(2, t2);
        telefonos.put(3, t3);

        assertThat(telefonos).containsKey(2);
    }





}