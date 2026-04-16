package org.example;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1, num2, resultado;

        System.out.println("=== Calculadora de Suma ===");

        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();

        resultado = num1 + num2;

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}