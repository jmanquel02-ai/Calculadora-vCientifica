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
    // --- Pruebas para Sistema de Ecuaciones (Opción 4) ---
    SistemaEcuaciones sis = new SistemaEcuaciones();

    @Test
    void testSistemaNormal() {
        // Ejemplo: 1x + 1y = 2 | 1x - 1y = 0 -> Resultado: x=1, y=1
        assertEquals(1.0, sis.calcularX(1, 1, 2, 1, -1, 0));
        assertEquals(1.0, sis.calcularY(1, 1, 2, 1, -1, 0));
    }

    @Test
    void testSistemaSinSolucion() {
        // Si las rectas son paralelas, el determinante es 0
        assertThrows(ArithmeticException.class, () -> sis.calcularX(1, 1, 2, 1, 1, 5));
    }
}