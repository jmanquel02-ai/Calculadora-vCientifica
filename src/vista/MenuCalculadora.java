package vista;

import logica.CalculadoraEcuaciones;
import java.util.Scanner;

public class MenuCalculadora {
    private CalculadoraEcuaciones calc = new CalculadoraEcuaciones();
    private Scanner leer = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("--- CALCULADORA DE ECUACIONES CUADRÁTICAS ---");
        try {
            System.out.print("Ingrese coeficiente a: ");
            double a = leer.nextDouble();
            System.out.print("Ingrese coeficiente b: ");
            double b = leer.nextDouble();
            System.out.print("Ingrese coeficiente c: ");
            double c = leer.nextDouble();

            double x1 = calc.calcularX1(a, b, c);
            double x2 = calc.calcularX2(a, b, c);

            System.out.println("\nResultados:");
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);

        } catch (ArithmeticException e) {
            System.out.println("\nError matemático: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\nError: Ingrese solo números válidos.");
        }
    }
}