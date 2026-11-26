// Importamos ArrayList para guardar los importes
import java.util.ArrayList;

// Clase principal (archivo Ejercicio3Hilos.java)
public class Ejercicio3Hilos {
    // main avisa de que join() puede lanzar InterruptedException
    public static void main(String[] args) throws InterruptedException {
        // Lista con los 3 importes que se cobran en caja
        ArrayList<Double> importes = new ArrayList<>();
        // Añadimos los importes
        importes.add(12.50);
        importes.add(30.00);
        importes.add(7.25);

        // HILO CAJA: la lambda es el run() del hilo y el segundo parámetro es su nombre
        Thread caja = new Thread(() -> {
            // Acumulador del total cobrado
            double total = 0;
            // Recorremos los importes
            for (double importe : importes) {
                // Mostramos cada cobro
                System.out.println("[Caja] Cobrado: " + importe + " €");
                // Sumamos al total
                total += importe;
                // Pausa corta para que se note que los hilos se mezclan
                pausa();
            }
            // Al terminar el bucle mostramos el total
            System.out.println("[Caja] Total cobrado: " + total + " €");
        }, "Caja");

        // HILO ALMACÉN: muestra del 1 al 5 los paquetes preparados
        Thread almacen = new Thread(() -> {
            // Contamos del 1 al 5
            for (int i = 1; i <= 5; i++) {
                // Mostramos el paquete preparado
                System.out.println("[Almacén] Paquete " + i + " preparado");
                // Misma pausa para mezclar las líneas
                pausa();
            }
        }, "Almacén");

        // Arrancamos los dos hilos: a partir de aquí corren a la vez
        caja.start();
        almacen.start();

        // join(): el main se queda esperando hasta que Caja termine
        caja.join();
        // join(): y luego hasta que Almacén termine
        almacen.join();

        // Solo se llega aquí cuando los dos hilos han acabado, así que sale siempre el último
        System.out.println("Jornada terminada");
    }

    // Método auxiliar: duerme el hilo actual 100 ms
    private static void pausa() {
        // sleep obliga a capturar InterruptedException
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // Si alguien interrumpe el hilo, restauramos la señal de interrupción
            Thread.currentThread().interrupt();
        }
    }
}