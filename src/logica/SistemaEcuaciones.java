package logica;

public class SistemaEcuaciones {

    // Método para calcular X usando la Regla de Cramer
    public double calcularX(double a, double b, double c, double d, double e, double f) {
        double determinante = (a * e) - (b * d);

        // Manejo de error si el sistema no tiene solución (det = 0)
        if (determinante == 0) {
            throw new ArithmeticException("El sistema no tiene solución única.");
        }

        return ((c * e) - (b * f)) / determinante;
    }

    // Método para calcular Y usando la Regla de Cramer
    public double calcularY(double a, double b, double c, double d, double e, double f) {
        double determinante = (a * e) - (b * d);

        if (determinante == 0) {
            throw new ArithmeticException("El sistema no tiene solución única.");
        }

        return ((a * f) - (c * d)) / determinante;
    }
}