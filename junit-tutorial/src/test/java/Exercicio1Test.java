import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Exercicio1Test {

    public Exercicio1Test() {

    }

    Exercicio1 objExercicio1 = new Exercicio1();

    @Test
    public void testInvalidos() {
        assertEquals("Ano inválido", objExercicio1.classificador(2025));
        assertEquals("Ano inválido", objExercicio1.classificador(1880));

    }


}