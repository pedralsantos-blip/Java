// Clase cuyo único dato va a ser usado por dos hilos a la vez
class ContadorCompartido {
 // Contador que empieza en cero
 private int valor = 0;
 // 'synchronized' pone un cerrojo: impide que dos hilos entren aquí
 // exactamente a la vez
 public synchronized void incrementar() {
 // Suma 1 a la variable compartida con total seguridad, sin que ningún
 // otro hilo le pise el dato
 this.valor++;
 // Al terminar el método, se abre el cerrojo para que pueda pasar el siguiente
 // hilo
 }
 // Método para consultar el resultado final
 public int getValor() {
 // Devuelve el valor acumulado
 return this.valor;
 // Cierra getValor
 }
// Cierra la clase ContadorCompartido
}
// Clase principal para probar dos hilos sumando sobre el mismo objeto (archivo
// EjemploSincronizacion.java)
public class EjemploSincronizacion {
 // 'throws InterruptedException' es necesario al usar .join() abajo
 public static void main(String[] args) throws InterruptedException {
 // Creamos el único objeto compartido por ambos hilos
 ContadorCompartido contador = new ContadorCompartido();
 // Primer hilo: llama 1000 veces al método incrementar()
 // Tarea del hilo 1 escrita con lambda
 Thread t1 = new Thread(() -> {
 // Bucle de 1000 vueltas
 for (int i = 0; i < 1000; i++) {
 // Suma 1 de forma sincronizada
 contador.incrementar();
 // Cierra el for
 }
 // Cierra el hilo t1
 });
 // Segundo hilo: también llama 1000 veces al mismo método incrementar()
 // Tarea del hilo 2 escrita con lambda
 Thread t2 = new Thread(() -> {
 // Bucle de 1000 vueltas
 for (int i = 0; i < 1000; i++) {
 // Suma 1 de forma sincronizada
 contador.incrementar();
 // Cierra el for
 }
 // Cierra el hilo t2
 });
 // Ponemos en marcha el hilo 1
 t1.start();
 // Ponemos en marcha el hilo 2 al mismo tiempo
 t2.start();
 // El método .join() le dice al programa principal: "Espera aquí hasta que
 // t1 y t2 hayan terminado sus 1000 vueltas":
 // Espera a que termine por completo el hilo 1
 t1.join();
 // Espera a que termine por completo el hilo 2
 t2.join();
 // Gracias a 'synchronized', el resultado será siempre exactamente 2000
 // sin perder ni una sola suma:
 // Imprime siempre 2000
 System.out.println("Valor final exacto del contador compartido: "
 + contador.getValor());
 // Cierra el método main
 }
// Cierra la clase EjemploSincronizacion
}
