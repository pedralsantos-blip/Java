public class ProductoServidor {
    // Atributos
    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public ProductoServidor(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = (precio < 0) ? 0 : precio;
        this.stock = (stock < 0) ? 0 : stock;
    }

    // Constructor abreviado
    public ProductoServidor(String nombre, double precio) {
        this(nombre, precio, 10);
    }

    // Métodos
    public void mostrarFicha() {
        System.out.printf("Producto: %s | Precio: %.2f € | Stock disponible: %d uds.%n",
                nombre, precio, stock);
    }

    public void vender(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor que cero.");
            return;
        }
        if (cantidad > stock) {
            System.out.println("Stock insuficiente para realizar la venta.");
            return;
        }
        stock -= cantidad;
        System.out.printf("Total a cobrar: %.2f €%n", cantidad * precio);
        System.out.println("Unidades que quedan en el almacén: " + stock);
    }

    public void reponerStock(int cantidadNueva) {
        if (cantidadNueva <= 0) {
            System.out.println("Error: La cantidad a reponer debe ser mayor que cero.");
            return;
        }
        stock += cantidadNueva;
        System.out.println("Stock repuesto. Nuevo stock de " + nombre + ": " + stock + " uds.");
    }
}
