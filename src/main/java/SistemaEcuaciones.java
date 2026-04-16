package org.example;

public class SistemaEcuaciones {

    // Calcula el determinante
    public double determinante(double a, double b, double c, double d) {
        return (a * d) - (b * c);
    }

    // Calcula X
    public double calcularX(double a, double b, double c, double d, double e, double f) {
        double det = determinante(a, b, c, d);

        if (det == 0) {
            throw new ArithmeticException("El sistema no tiene solución única.");
        }

        return (e * d - b * f) / det;
    }

    // Calcula Y
    public double calcularY(double a, double b, double c, double d, double e, double f) {
        double det = determinante(a, b, c, d);

        if (det == 0) {
            throw new ArithmeticException("El sistema no tiene solución única.");
        }

        return (a * f - e * c) / det;
    }
}