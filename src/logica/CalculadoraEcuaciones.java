package logica;

public class CalculadoraEcuaciones {

    public double calcularDiscriminante(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    public double calcularX1(double a, double b, double c) {
        double d = calcularDiscriminante(a, b, c);
        if (a == 0) throw new ArithmeticException("A no puede ser 0");
        if (d < 0) throw new ArithmeticException("Raíz imaginaria");
        return (-b + Math.sqrt(d)) / (2 * a);
    }

    public double calcularX2(double a, double b, double c) {
        double d = calcularDiscriminante(a, b, c);
        if (a == 0 || d < 0) throw new ArithmeticException("Error en cálculo");
        return (-b - Math.sqrt(d)) / (2 * a);
    }
}