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
    // --- Pruebas para Ecuación de la Recta (Opción 5) ---
    EcuacionRecta recta = new EcuacionRecta();

    @Test
    void testRectaNormal() {
        // Puntos (0,0) y (2,4) -> m debe ser 2.0 y b debe ser 0.0
        double m = recta.calcularPendiente(0, 0, 2, 4);
        assertEquals(2.0, m);
        assertEquals(0.0, recta.calcularIntercepto(0, 0, m));
    }

    @Test
    void testErrorRectaVertical() {
        // x1 y x2 iguales (2,5 y 2,10) -> Debe lanzar error
        assertThrows(ArithmeticException.class, () -> recta.calcularPendiente(2, 5, 2, 10));
    }
}