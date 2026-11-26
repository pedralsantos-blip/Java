// Clase para ver dos hilos trabajando simultáneamente (archivo
// EjemploThreadBasico.java)
public class EjemploThreadBasico {
 // Aquí arranca el HILO PRINCIPAL del programa
 public static void main(String[] args) {
 // Creamos un HILO SECUNDARIO nuevo y le pasamos con una lambda () -> {
 // ... } el trabajo que debe realizar:
 // Todo lo que esté dentro de estas llaves lo hará el segundo trabajador
 // en paralelo
 Thread hiloSecundario = new Thread(() -> {
 // El hilo secundario cuenta del 1 al 5
 for (int i = 1; i <= 5; i++) {
 // Imprime su avance en consola
 System.out.println("[Hilo secundario]: paso " + i);
 // Cierra el bucle del hilo secundario
 }
 // Cierra la creación del objeto Thread
 });
 // ¡MUY IMPORTANTE! Con .start() arrancamos el hilo secundario para que
 // empiece a correr en paralelo
 hiloSecundario.start();
 // Mientras el hilo secundario ya está corriendo por su cuenta, el hilo
 // principal sigue ejecutando este otro bucle a la vez:
 // El hilo principal también cuenta del 1 al 5 al mismo tiempo
 for (int i = 1; i <= 5; i++) {
 // Imprime el avance del hilo principal
 System.out.println("[Hilo principal]: paso " + i);
 // Cierra el bucle del hilo principal
 }
 // Cierra el método main
 }
// Cierra la clase EjemploThreadBasico
}