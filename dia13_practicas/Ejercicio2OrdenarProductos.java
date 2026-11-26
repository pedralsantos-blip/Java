// Importamos ArrayList para guardar los productos
import java.util.ArrayList;

// Clase principal (archivo Ejercicio2OrdenarProductos.java)
public class Ejercicio2OrdenarProductos {
    // Punto de entrada del programa
    public static void main(String[] args) {
        // Lista con 5 productos de distinta longitud
        ArrayList<String> productos = new ArrayList<>();
        // Añadimos los productos (a propósito, sin ningún orden)
        productos.add("Patata");
        productos.add("León");
        productos.add("Acequia");
        productos.add("Pelicula");
        productos.add("Caos");

        // ORDEN 1: de más corto a más largo
        // a y b son dos nombres que sort() compara; devolvemos negativo si a va antes que b
        productos.sort((a, b) -> Integer.compare(a.length(), b.length()));
        // Título de la primera lista
        System.out.println("De más corto a más largo:");
        // Recorremos la lista ya ordenada
        for (String p : productos) {
            // Mostramos el producto y su longitud
            System.out.println("  " + p + " (" + p.length() + ")");
        }

        // ORDEN 2: de más largo a más corto (la segunda lambda)
        // Es la misma idea con a y b intercambiados: así el más largo va primero
        productos.sort((a, b) -> Integer.compare(b.length(), a.length()));
        // Título de la segunda lista
        System.out.println("De más largo a más corto:");
        // Recorremos la lista con el nuevo orden
        for (String p : productos) {
            // Mostramos el producto y su longitud
            System.out.println("  " + p + " (" + p.length() + ")");
        }

        // FILTRO: solo los productos con más de 5 letras
        System.out.println("Productos con más de 5 letras:");
        // Recorremos la lista con un for
        for (String p : productos) {
            // Comprobamos la longitud del nombre
            if (p.length() > 5) {
                // Solo se muestra si cumple la condición
                System.out.println("  " + p);
            }
        }
    }
}
