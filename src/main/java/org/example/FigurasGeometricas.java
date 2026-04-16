package org.example;

public class FigurasGeometricas {

    // CUADRADO
    public double areaCuadrado(double lado) {
        return lado * lado;
    }

    public double perimetroCuadrado(double lado) {
        return 4 * lado;
    }

    // RECTÁNGULO
    public double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    public double perimetroRectangulo(double base, double altura) {
        return 2 * (base + altura);
    }

    // CÍRCULO
    public double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public double perimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }

    // ESFERA
    public double volumenEsfera(double radio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }

    public double areaEsfera(double radio) {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    // CUBO
    public double volumenCubo(double lado) {
        return Math.pow(lado, 3);
    }

    public double areaCubo(double lado) {
        return 6 * Math.pow(lado, 2);
    }

    // CONO
    public double volumenCono(double radio, double altura) {
        return (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;
    }

    public double areaCono(double radio, double generatriz) {
        return Math.PI * radio * (radio + generatriz);
    }
}