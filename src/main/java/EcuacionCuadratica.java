public class EcuacionCuadratica package org.example;

public class EcuacionCuadratica {

    // Calcula el discriminante
    public double discriminante(double a, double b, double c) {
        return Math.pow(b, 2) - (4 * a * c);
    }

    // Calcula X1
    public double calcularX1(double a, double b, double c) {
        if (a == 0) {
            throw new ArithmeticException("A no puede ser 0.");
        }

        double d = discriminante(a, b, c);

        if (d < 0) {
            throw new ArithmeticException("No existen soluciones reales.");
        }

        return (-b + Math.sqrt(d)) / (2 * a);
    }

    // Calcula X2
    public double calcularX2(double a, double b, double c) {
        if (a == 0) {
            throw new ArithmeticException("A no puede ser 0.");
        }

        double d = discriminante(a, b, c);

        if (d < 0) {
            throw new ArithmeticException("No existen soluciones reales.");
        }

        return (-b - Math.sqrt(d)) / (2 * a);
    }
}{
        }
