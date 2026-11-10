package dia2_practicas;

import java.util.Scanner;

public class ComparadorNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el primer número entero: ");
        int a = teclado.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int b = teclado.nextInt();

        System.out.println("¿El primero es mayor que el segundo? " + (a > b));
        System.out.println("¿El primero es menor que el segundo? " + (a < b));
        System.out.println("¿Son exactamente iguales? " + (a == b));

        teclado.close();
    }
}