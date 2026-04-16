package org.example;

public class OperacionExtra {

    public double mayor(double a, double b) {
        return Math.max(a, b);
    }

    public double menor(double a, double b) {
        return Math.min(a, b);
    }

    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double porcentaje(double numero, double porcentaje) {
        return numero * (porcentaje / 100.0);
    }
}