import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercicio3Test {

    public Exercicio3Test() {

    }

    Exercicio3 objExercicio3 = new Exercicio3();

    @Test
    public void testInvalidos() {
        assertEquals("Renovação a cada 3 anos", objExercicio3.classificador(70));
        assertEquals("Renovação a cada 10 anos", objExercicio3.classificador(34));
        assertEquals("Renovação a cada 5 anos", objExercicio3.classificador(62));
    }


}