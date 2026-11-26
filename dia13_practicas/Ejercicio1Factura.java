// Importamos ArrayList para guardar las líneas de la factura
import java.util.ArrayList;

// Clase Factura: guarda el cliente y una lista de líneas
class Factura {
    // Nombre del cliente de esta factura
    private String cliente;
    // Lista donde se guardan las líneas (cada una es un objeto Linea)
    private ArrayList<Linea> lineas = new ArrayList<>();

    // Constructor: recibe el cliente al crear la factura
    public Factura(String cliente) {
        // Guardamos el cliente en el atributo
        this.cliente = cliente;
    }

    // CLASE INTERNA: solo tiene sentido dentro de una Factura
    class Linea {
        // Nombre del producto
        private String producto;
        // Precio por unidad
        private double precio;
        // Número de unidades
        private int unidades;

        // Constructor de la línea
        public Linea(String producto, double precio, int unidades) {
            // Guardamos cada dato en su atributo
            this.producto = producto;
            this.precio = precio;
            this.unidades = unidades;
        }

        // Subtotal de la línea: precio x unidades
        public double getSubtotal() {
            // Devolvemos el resultado de la multiplicación
            return precio * unidades;
        }
    }

    // Crea la línea por dentro y la guarda en la lista
    public void agregarLinea(String producto, double precio, int unidades) {
        // new Linea(...) se crea dentro de Factura, sin que el main sepa nada de Linea
        Linea nueva = new Linea(producto, precio, unidades);
        // Añadimos la línea a la lista
        lineas.add(nueva);
    }

    // Imprime la factura completa
    public void mostrarFactura() {
        // Cabecera con el cliente
        System.out.println("FACTURA - Cliente: " + cliente);
        // Acumulador del total
        double total = 0;
        // Recorremos todas las líneas
        for (Linea l : lineas) {
            // Subtotal de esta línea
            double subtotal = l.getSubtotal();
            // Imprimimos producto, cuenta y subtotal
            System.out.printf("  %s: %.2f € x %d = %.2f €%n",
                    l.producto, l.precio, l.unidades, subtotal);
            // Sumamos al total
            total += subtotal;
        }
        // Mostramos el total sin descuento
        System.out.printf("Total: %.2f €%n", total);
        // Si supera los 100 €, aplicamos el 10 % de descuento
        if (total > 100) {
            // Importe del descuento
            double descuento = total * 0.10;
            // Importe final
            double finalAPagar = total - descuento;
            // Mostramos descuento e importe final
            System.out.printf("Descuento 10 %%: -%.2f €%n", descuento);
            System.out.printf("Importe final: %.2f €%n", finalAPagar);
        }
        // Línea en blanco para separar facturas
        System.out.println();
    }
}

// Clase principal (archivo Ejercicio1Factura.java)
public class Ejercicio1Factura {
    // Punto de entrada del programa
    public static void main(String[] args) {
        // Factura 1: supera los 100 € (110,99 €)
        Factura f1 = new Factura("Ana Pérez");
        f1.agregarLinea("Teclado", 45.50, 2);
        f1.agregarLinea("Ratón", 19.99, 1);
        f1.mostrarFactura();

        // Factura 2: no supera los 100 € (16,00 €)
        Factura f2 = new Factura("Luis Gómez");
        f2.agregarLinea("Cuaderno", 2.50, 4);
        f2.agregarLinea("Bolígrafo", 1.20, 5);
        f2.mostrarFactura();
    }
}