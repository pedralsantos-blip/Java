package dia6_practicas;

public class Producto {
 // Atributos privados: solo el código que esté dentro de este archivo
 // Producto.java puede tocarlos directamente
 // Guarda el nombre comercial de cada producto
 private String nombre;
 // Guarda el precio en euros con decimales de cada producto
 private double precio;
 // Guarda el número entero de unidades disponibles en el almacén
 private int stock;
 // Método público (Setter) para asignar o cambiar el nombre del producto desde
 // fuera
 public void setNombre(String nombre) {
 // 'this.nombre' se refiere al atributo de arriba, y le guarda el 'nombre'
 // recibido entre paréntesis
 this.nombre = nombre;
 // Cierra el método setNombre
 }
 // Método público (Setter) para asignar el precio del producto
 public void setPrecio(double precio) {
 // Ventanilla con filtro: un precio negativo no tiene sentido
 if (precio >= 0) {
 // Guarda el valor recibido por parámetro dentro del atributo privado
 // 'this.precio' de este objeto
 this.precio = precio;
 // Si el precio es negativo, el if no se cumple y el precio anterior queda
 // protegido
 }
 // Cierra el método setPrecio
 }
 // Método público (Setter) para asignar las unidades en stock
 public void setStock(int stock) {
 // Filtro: no puede haber unidades negativas en el almacén (0 sí es
 // válido)
 if (stock >= 0) {
 // Guarda la cantidad recibida dentro del atributo privado
 // 'this.stock' de este objeto
 this.stock = stock;
 // Si el stock es negativo, se ignora
 }
 }
// Cierra el método setStock
 // Método público para que el producto imprima su propia ficha completa por
 // pantalla
 public void mostrarInformacion() {
 // Imprime el nombre guardado en este objeto concreto
 System.out.println("Nombre del artículo: " + nombre);
 // Imprime el precio guardado en este objeto concreto
 System.out.println("Precio unitario: " + precio + " euros");
 // Imprime el stock guardado en este objeto concreto
 System.out.println("Unidades en stock: " + stock);
 // Cierra el método mostrarInformacion
 }
// Cierra la clase Producto
}
    

