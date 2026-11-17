package dia6_practicas;
public class PrincipalProducto {// Clase principal con el método main para poner en marcha el ejemplo (archivo
// PrincipalProducto.java)
 // Punto de entrada donde arranca la ejecución
 public static void main(String[] args) {
 // Instanciamos (fabricamos) el primer objeto de tipo Producto en memoria
 // y lo llamamos 'p1'
 Producto p1 = new Producto();
 // Instanciamos un segundo objeto independiente usando el mismo molde y lo
 // llamamos 'p2'
 Producto p2 = new Producto();
 // Llamamos al método público setNombre de 'p1' para guardar su nombre
 p1.setNombre("Teclado Mecánico");
 // Llamamos al método setPrecio de 'p1' para asignarle 29.99 euros
 p1.setPrecio(29.99);
 // Llamamos al método setStock de 'p1' para asignarle 10 unidades
 p1.setStock(10);
 // Rellenamos el segundo objeto 'p2' con sus propios datos sin alterar
 // para nada a 'p1'
 p2.setNombre("Ratón Inalámbrico");
 // Asignamos el precio de 18.50 euros exclusivamente al objeto 'p2'
 p2.setPrecio(18.50);
 // Asignamos 25 unidades de stock exclusivamente al objeto 'p2'
 p2.setStock(25);
 // Pedimos al primer objeto ('p1') que muestre sus datos por consola
 p1.mostrarInformacion();
 // Imprimimos una línea separadora entre ambos productos
 System.out.println("----------------------------------");
 // Pedimos al segundo objeto ('p2') que muestre sus propios datos por
 // consola

 p2.mostrarInformacion();
 // Cierra el método main
 }
// Cierra la clase PrincipalProducto
}

    

