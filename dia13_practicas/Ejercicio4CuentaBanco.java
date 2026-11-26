// Clase CuentaBanco: el saldo se comparte entre dos hilos
class CuentaBanco {
    // Saldo de la cuenta, empieza en 1000 €
    private double saldo = 1000;

    // synchronized: solo un hilo a la vez puede ejecutar este método sobre esta cuenta
    public synchronized void ingresar(double cantidad) {
        // Sumamos la cantidad al saldo
        saldo += cantidad;
    }

    // synchronized: comparte el mismo "candado" que ingresar()
    public synchronized void retirar(double cantidad) {
        // Solo descontamos si hay saldo suficiente
        if (saldo >= cantidad) {
            // Restamos la cantidad
            saldo -= cantidad;
        }
    }

    // También synchronized para leer el saldo de forma segura
    public synchronized double getSaldo() {
        // Devolvemos el saldo actual
        return saldo;
    }
}

// Clase principal (archivo Ejercicio4CuentaBanco.java)
public class Ejercicio4CuentaBanco {
    // main avisa de que join() puede lanzar InterruptedException
    public static void main(String[] args) throws InterruptedException {
        // Una única cuenta compartida por los dos hilos
        CuentaBanco cuenta = new CuentaBanco();

        // Resultado calculado a mano: 1000 + 100*10 - 100*5
        double esperado = 1500;

        // Hilo que hace 100 ingresos de 10 €
        Thread ingresos = new Thread(() -> {
            // Repetimos 100 veces
            for (int i = 0; i < 100; i++) {
                // Ingresamos 10 €
                cuenta.ingresar(10);
            }
        }, "Ingresos");

        // Hilo que hace 100 retiradas de 5 €
        Thread retiradas = new Thread(() -> {
            // Repetimos 100 veces
            for (int i = 0; i < 100; i++) {
                // Retiramos 5 €
                cuenta.retirar(5);
            }
        }, "Retiradas");

        // Arrancamos los dos hilos
        ingresos.start();
        retiradas.start();

        // Esperamos a que terminen los dos antes de leer el saldo
        ingresos.join();
        retiradas.join();

        // Leemos el saldo final
        double saldoFinal = cuenta.getSaldo();
        // Mostramos esperado y real
        System.out.println("Saldo esperado: " + esperado + " €");
        System.out.println("Saldo final:    " + saldoFinal + " €");

        // Comprobamos que coinciden
        if (saldoFinal == esperado) {
            System.out.println("Correcto: el saldo coincide.");
        } else {
            System.out.println("Error: el saldo no coincide.");
        }
    }
}
