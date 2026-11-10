package dia2_practicas;

import java.util.Scanner;

public class CalculadoraSuma {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double a = teclado.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double b = teclado.nextDouble();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));

        teclado.close();
    }
}