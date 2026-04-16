package org.example;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperacionBasica basica = new OperacionBasica();
        OperacionExtra extra = new OperacionExtra();

        int opcion;
        double num1, num2, resultado;

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Mayor de dos números");
            System.out.println("6. Menor de dos números");
            System.out.println("7. Potencia");
            System.out.println("8. Porcentaje");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 8) {
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextDouble();

                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextDouble();

                try {
                    switch (opcion) {
                        case 1:
                            resultado = basica.sumar(num1, num2);
                            System.out.println("Resultado: " + resultado);
                            break;
                        case 2:
                            resultado = basica.restar(num1, num2);
                            System.out.println("Resultado: " + resultado);
                            break;
                        case 3:
                            resultado = basica.multiplicar(num1, num2);
                            System.out.println("Resultado: " + resultado);
                            break;
                        case 4:
                            resultado = basica.dividir(num1, num2);
                            System.out.println("Resultado: " + resultado);
                            break;
                        case 5:
                            resultado = extra.mayor(num1, num2);
                            System.out.println("El mayor es: " + resultado);
                            break;
                        case 6:
                            resultado = extra.menor(num1, num2);
                            System.out.println("El menor es: " + resultado);
                            break;
                        case 7:
                            resultado = extra.potencia(num1, num2);
                            System.out.println("Resultado: " + resultado);
                            break;
                        case 8:
                            resultado = extra.porcentaje(num1, num2);
                            System.out.println("Resultado: " + resultado);
                            break;
                    }
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else if (opcion != 0) {
                System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}