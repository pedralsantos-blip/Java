// CLASE EXTERIOR: Representa el pedido general de un cliente (archivo
// Pedido.java)
public class Pedido {
 // Atributo privado del pedido exterior que guarda el nombre del comprador
 private String cliente;
 // Constructor de la clase exterior Pedido
 public Pedido(String cliente) {
 // Guarda el nombre del cliente que realiza el pedido
 this.cliente = cliente;
 // Cierra el constructor de Pedido
 }
 // CLASE INTERNA: Está escrita DENTRO de las llaves de Pedido porque una línea
 // solo tiene sentido dentro de un pedido
 // Definimos la clase interna LineaPedido
 class LineaPedido {
 // Atributo propio de la línea: qué artículo se ha comprado
 private String producto;
 // Atributo propio de la línea: cuántas unidades se han pedido
 private int cantidad;
 // Constructor de la clase interna LineaPedido
 public LineaPedido(String producto, int cantidad) {
 // Guarda el nombre del producto de esta línea
 this.producto = producto;
 // Guarda la cantidad de unidades de esta línea
 this.cantidad = cantidad;
 // Cierra el constructor de LineaPedido
 }
 // Método de la clase interna para imprimir el detalle completo
 public void mostrarLinea() {
 // ¡GRAN VENTAJA! La clase interna puede leer directamente el atributo
 // 'cliente' de su objeto exterior Pedido:
 // Accede directamente al atributo privado de la clase exterior
 System.out.println("Cliente del pedido: " + cliente);
 // Muestra el producto de esta línea
 System.out.println("Producto: " + this.producto);
 // Muestra la cantidad de esta línea
 System.out.println("Cantidad: " + this.cantidad + " unidades");
 // Cierra mostrarLinea
 }
 // Cierra la clase interna LineaPedido
 }
 // Punto de entrada principal para probar la clase exterior y su clase interna
 public static void main(String[] args) {
 // PASO 1: Primero creamos obligatoriamente el objeto exterior 'pedido'
 Pedido pedido = new Pedido("Ana");
 // PASO 2: A partir de ese objeto 'pedido' ya existente, creamos un objeto
 // de su clase interna usando 'pedido.new':
 // Crea una línea de 3 cuadernos vinculada al pedido de Ana
 Pedido.LineaPedido linea = pedido.new LineaPedido("Cuaderno", 3);
 // PASO 3: Mostramos los datos de la línea (veremos que imprime "Ana",
 // "Cuaderno" y "3")
 linea.mostrarLinea();
 // Cierra el método main
 }
// Cierra la clase exterior Pedido
}
