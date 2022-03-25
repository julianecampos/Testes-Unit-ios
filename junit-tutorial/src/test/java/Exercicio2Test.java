import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Exercicio2Test {

    public Exercicio2Test() {

    }

    Exercicio2 objExercicio2 = new Exercicio2();

    @Test
    public void testInvalidos() {
        assertEquals("Nota inválida", objExercicio2.classificador(11));
        assertEquals("Nota inválida", objExercicio2.classificador(18));

    }


}