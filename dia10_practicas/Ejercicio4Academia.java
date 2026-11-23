// Interfaz: cualquier trabajador que cobre debe saber calcular su pago
interface Pagable {
    double calcularPago();
}

// Cobra un sueldo mensual fijo
class ProfesorFijo implements Pagable {

    private String nombre;
    private double sueldoMensual;

    public ProfesorFijo(String nombre, double sueldoMensual) {
        this.nombre = nombre;
        this.sueldoMensual = sueldoMensual;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularPago() {
        return sueldoMensual;
    }
}

// Cobra según las horas trabajadas
class ProfesorPorHoras implements Pagable {

    private String nombre;
    private int horasTrabajadas;
    private double precioHora;

    public ProfesorPorHoras(String nombre, int horasTrabajadas, double precioHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.precioHora = precioHora;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * precioHora;
    }
}

// Clase principal para probar (el nombre coincide con el archivo)
public class Ejercicio4Academia {
    public static void main(String[] args) {
        Pagable[] trabajadores = {
            new ProfesorFijo("Marta", 1800),
            new ProfesorPorHoras("Luis", 60, 22.5),
            new ProfesorFijo("Carmen", 2100),
            new ProfesorPorHoras("Javier", 40, 25)
        };

        System.out.println("--- Pagos de la academia ---");
        double total = 0;

        for (int i = 0; i < trabajadores.length; i++) {
            double pago = trabajadores[i].calcularPago();
            System.out.println("Trabajador " + (i + 1) + ": " + pago + " €");
            total += pago;
        }

        System.out.println("Total a pagar: " + total + " €");
    }
}
