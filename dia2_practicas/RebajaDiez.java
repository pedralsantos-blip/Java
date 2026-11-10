package dia2_practicas;

import java.util.Scanner;

public class RebajaDiez {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nombre del artículo: ");
        String articulo = teclado.nextLine();

        System.out.print("Precio: ");
        double precio = teclado.nextDouble();

        double descuento = precio * 0.10;
        double precioFinal = precio - descuento;

        System.out.println("Artículo: " + articulo);
        System.out.println("Precio original: " + precio + " €");
        System.out.println("Descuento (10%): " + descuento + " €");
        System.out.println("Precio final: " + precioFinal + " €");

        teclado.close();
    }
}
    

