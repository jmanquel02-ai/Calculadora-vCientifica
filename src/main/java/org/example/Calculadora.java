package org.example;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        OperacionBasica basica = new OperacionBasica();
        OperacionExtra extra = new OperacionExtra();
        FigurasGeometricas geo = new FigurasGeometricas();
        EcuacionCuadratica ecuacion = new EcuacionCuadratica();
        SistemaEcuaciones sistema = new SistemaEcuaciones();
        EcuacionRecta recta = new EcuacionRecta();

        int opcionPrincipal;

        do {
            System.out.println("\n=== CALCULADORA VCIENTIFICA ===");
            System.out.println("1. Operaciones aritméticas");
            System.out.println("2. Ecuación cuadrática");
            System.out.println("3. Figuras geométricas");
            System.out.println("4. Sistema ecuaciones lineales");
            System.out.println("5. Ecuación de la recta");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcionPrincipal = scanner.nextInt();

            switch (opcionPrincipal) {

                // ================= OPERACIONES =================
                case 1:
                    int opcion;
                    double num1, num2, resultado;

                    do {
                        System.out.println("\n=== OPERACIONES ARITMÉTICAS ===");
                        System.out.println("1. Sumar");
                        System.out.println("2. Restar");
                        System.out.println("3. Multiplicar");
                        System.out.println("4. Dividir");
                        System.out.println("5. Mayor");
                        System.out.println("6. Menor");
                        System.out.println("7. Potencia");
                        System.out.println("8. Porcentaje");
                        System.out.println("0. Volver");

                        opcion = scanner.nextInt();

                        if (opcion >= 1 && opcion <= 8) {
                            System.out.print("Ingrese número 1: ");
                            num1 = scanner.nextDouble();

                            System.out.print("Ingrese número 2: ");
                            num2 = scanner.nextDouble();

                            try {
                                switch (opcion) {
                                    case 1 -> System.out.println(basica.sumar(num1, num2));
                                    case 2 -> System.out.println(basica.restar(num1, num2));
                                    case 3 -> System.out.println(basica.multiplicar(num1, num2));
                                    case 4 -> System.out.println(basica.dividir(num1, num2));
                                    case 5 -> System.out.println(extra.mayor(num1, num2));
                                    case 6 -> System.out.println(extra.menor(num1, num2));
                                    case 7 -> System.out.println(extra.potencia(num1, num2));
                                    case 8 -> System.out.println(extra.porcentaje(num1, num2));
                                }
                            } catch (Exception e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        }

                    } while (opcion != 0);
                    break;

                // ================= ECUACION CUADRATICA =================
                case 2:
                    try {
                        System.out.print("A: ");
                        double a = scanner.nextDouble();

                        System.out.print("B: ");
                        double b = scanner.nextDouble();

                        System.out.print("C: ");
                        double c = scanner.nextDouble();

                        double x1 = ecuacion.calcularX1(a, b, c);
                        double x2 = ecuacion.calcularX2(a, b, c);

                        System.out.println("X1 = " + x1);
                        System.out.println("X2 = " + x2);

                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                // ================= FIGURAS =================
                case 3:
                    int figura;

                    do {
                        System.out.println("\n=== FIGURAS ===");
                        System.out.println("1. Cuadrado");
                        System.out.println("2. Rectángulo");
                        System.out.println("3. Círculo");
                        System.out.println("4. Esfera");
                        System.out.println("5. Cubo");
                        System.out.println("6. Cono");
                        System.out.println("0. Volver");

                        figura = scanner.nextInt();

                        try {
                            switch (figura) {
                                case 1 -> {
                                    double lado = scanner.nextDouble();
                                    System.out.println(geo.areaCuadrado(lado));
                                }
                                case 2 -> {
                                    double base = scanner.nextDouble();
                                    double altura = scanner.nextDouble();
                                    System.out.println(geo.areaRectangulo(base, altura));
                                }
                                case 3 -> {
                                    double r = scanner.nextDouble();
                                    System.out.println(geo.areaCirculo(r));
                                }
                                case 4 -> {
                                    double r = scanner.nextDouble();
                                    System.out.println(geo.volumenEsfera(r));
                                }
                                case 5 -> {
                                    double lado = scanner.nextDouble();
                                    System.out.println(geo.volumenCubo(lado));
                                }
                                case 6 -> {
                                    double r = scanner.nextDouble();
                                    double h = scanner.nextDouble();
                                    double g = scanner.nextDouble();
                                    System.out.println(geo.volumenCono(r, h));
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                        }

                    } while (figura != 0);
                    break;

                // ================= SISTEMA =================
                case 4:
                    try {
                        System.out.println("Ax + By = E");
                        System.out.println("Cx + Dy = F");

                        double a = scanner.nextDouble();
                        double b = scanner.nextDouble();
                        double c = scanner.nextDouble();
                        double d = scanner.nextDouble();
                        double e = scanner.nextDouble();
                        double f = scanner.nextDouble();

                        double x = sistema.calcularX(a, b, c, d, e, f);
                        double y = sistema.calcularY(a, b, c, d, e, f);

                        System.out.println("X=" + x + " Y=" + y);

                    } catch (Exception ex) {
                        System.out.println("Error: " + ex.getMessage());
                    }
                    break;

                // ================= RECTA =================
                case 5:
                    try {
                        double x1 = scanner.nextDouble();
                        double y1 = scanner.nextDouble();
                        double x2 = scanner.nextDouble();
                        double y2 = scanner.nextDouble();

                        double m = recta.calcularPendiente(x1, y1, x2, y2);
                        double b = recta.calcularIntercepto(x1, y1, m);

                        System.out.println(recta.ecuacionRecta(m, b));

                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcionPrincipal != 6);

        scanner.close();
    }
}