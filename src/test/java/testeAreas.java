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

    @Test 
    public void testeCalcularAreaRetangulo(){

        int num1 = 40;
        int num2 = 10;
        int resultadoEsperado = 400;
        int resulatadoAtual = Main.calcularAreaRetangulo(num1, num2);

        assertEquals(resultadoEsperado, resulatadoAtual);
    }

    @Test 
    public void testeCalcularAreaCirculo(){

        int rad = 40;
        double resultadoEsperado = 5024.0;
        double resulatadoAtual = Main.calcularAreaCirculo(rad);

        assertEquals(resultadoEsperado, resulatadoAtual);
    }

    @Test 
    public void testeCalcularAreaTriangulo(){

        int b = 2;
        int h = 7;
        int resultadoEsperado = 7;
        int resulatadoAtual = Main.calcularAreaTriangulo(b, h);

        assertEquals(resultadoEsperado, resulatadoAtual);
    }
}