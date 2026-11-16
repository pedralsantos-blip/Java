package dia6_practicas;
// Define la clase para practicar el acceso a casillas concretas de un array
// (archivo LeerYModificarArray.java)
public class LeerYModificarArray {
 // Punto de entrada obligatorio del programa
 public static void main(String[] args) {
 // Creamos el array con 5 edades iniciales (ocupan las posiciones 0, 1, 2,
 // 3 y 4)
 int[] edades = {18, 20, 19, 21, 22};
 // Accede a la posición 0 del array y muestra su valor por consola: 18
 System.out.println("Primera casilla (índice 0): " + edades[0]);
 // Accede a la posición 2 del array y muestra su valor original: 19
 System.out.println("Tercera casilla (índice 2): " + edades[2]);
 // Modificamos únicamente la casilla del índice 2, sustituyendo el 19 que
 // había antes por el nuevo valor 25
 edades[2] = 25;
 // Volvemos a consultar el índice 2 y comprobamos que ahora muestra: 25
 System.out.println("Tercera casilla tras el cambio: " + edades[2]);
 // Cierra el método principal main
 }
// Cierra la clase LeerYModificarArray
}
    

