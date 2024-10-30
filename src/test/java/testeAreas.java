import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.qtechwired.Main;

public class testeAreas {
    
    @Test 
    public void testeCalcularAreaCuadrado(){

        int num1 = 10;
        int resultadoEsperado = 100;
        int resulatadoAtual = Main.calcularAreaCuadrado(num1);

        assertEquals(resultadoEsperado, resulatadoAtual);
    }
}