package logica;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraEcuacionesTest {
    CalculadoraEcuaciones calc = new CalculadoraEcuaciones();

    @Test
    void testCalculoNormal() {
        assertEquals(2.0, calc.calcularX1(1, -3, 2));
        assertEquals(1.0, calc.calcularX2(1, -3, 2));
    }

    @Test
    void testErrorDivisionPorCero() {
        assertThrows(ArithmeticException.class, () -> calc.calcularX1(0, 2, 1));
    }
}