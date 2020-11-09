package CalculadoraTest;

import Calculadora.operaciones;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTestJava {

    operaciones calculator1 = new operaciones();

    @Test
    public void testSuma1() {
        assertEquals(5, calculator1.suma(2, 3));
    }

    @Test
    public void testSuma2() {
        assertEquals(6, calculator1.suma(3, 3));
    }

    @Test
    public void testResta1() {
        assertEquals(2, calculator1.resta(5, 3));
    }

    @Test
    public void testResta2() {
        assertEquals(2, calculator1.resta(6, 3));
    }
    
    @Test
    public void testMultiplicacion1() {
        assertEquals(20, calculator1.multiplicacion(5, 4));
    }

    @Test
    public void testMultiplicacion2() {
        assertEquals(12, calculator1.multiplicacion(3, 8));
    }
    
    @Test
    public void testDivision1() {
        assertEquals(5, calculator1.division(25, 5));
    }

    @Test
    public void testDivision2() {
        assertEquals(3, calculator1.division(18, 6));
    }
    
    @Test
    public void testExponenciacion1() {
        assertEquals(25, calculator1.exponenciacion(5, 2));
    }

    @Test
    public void testExponenciacion2() {
        assertEquals(200, calculator1.exponenciacion(6, 3));
    }
    
}

