// Interfaz funcional: tiene un único método pendiente
interface Mensaje {
 // Recibe un nombre por parámetro y no devuelve nada
 void mostrar(String nombre);
// Cierra la interfaz Mensaje
}
// FORMA 1 (Día 10): una clase entera solo para implementar mostrar()
class MensajeBienvenida implements Mensaje {
 // Cumple el contrato de la interfaz Mensaje
 @Override
 // Cuerpo del método mostrar
 public void mostrar(String nombre) {
 // Primera instrucción
 System.out.println("Hola, " + nombre);
 // Segunda instrucción
 System.out.println("Bienvenido al programa de servidor.");
 // Cierra el método mostrar
 }
// Cierra la clase MensajeBienvenida
}
// Clase principal (archivo EjemploLambdaConBloque.java)
public class EjemploLambdaConBloque {
 // Punto de entrada del programa
 public static void main(String[] args) {
 // FORMA 1: objeto de la clase que implementa la interfaz
 Mensaje saludo1 = new MensajeBienvenida();
 // Ejecuta el método mostrar de MensajeBienvenida
 saludo1.mostrar("Lucía");
 // FORMA 2 (hoy): la lambda sustituye a toda la clase MensajeBienvenida.
 // A la izquierda de -> el parámetro 'nombre'; a la derecha, entre llaves,
 // el cuerpo de mostrar():
 // Guardamos la lambda en la variable saludo2 (todavía no se ejecuta)
 Mensaje saludo2 = nombre -> {
 // Estas llaves son el cuerpo de mostrar(), no un método nuevo dentro
 // del main
 System.out.println("Hola, " + nombre);
 // Segunda instrucción del bloque
 System.out.println("Bienvenido al programa de servidor.");
 // Termina en ; porque es una asignación, igual que int x = 5;
 };
 // Aquí es cuando se ejecuta la lambda
 saludo2.mostrar("Pedro");
 // Cierra el método main
 }
// Cierra la clase EjemploLambdaConBloque
}
