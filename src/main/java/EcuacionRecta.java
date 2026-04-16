package org.example;

public class EcuacionRecta {

    // Calcula la pendiente (m)
    public double calcularPendiente(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            throw new ArithmeticException("Pendiente indefinida (recta vertical).");
        }
        return (y2 - y1) / (x2 - x1);
    }

    // Calcula el intercepto (b)
    public double calcularIntercepto(double x1, double y1, double m) {
        return y1 - (m * x1);
    }

    // Devuelve la ecuación completa como texto
    public String ecuacionRecta(double m, double b) {
        return "y = " + m + "x + " + b;
    }
}