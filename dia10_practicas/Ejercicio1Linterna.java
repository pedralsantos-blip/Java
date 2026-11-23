// Interfaz que define lo que debe poder hacer un dispositivo recargable
interface Recargable {
    void cargar();
    void usar();
}

// Linterna implementa Recargable: tiene que escribir cargar() y usar()
class Linterna implements Recargable {

    private int nivelBateria; // de 0 a 100

    public Linterna(int nivelInicial) {
        // Nos aseguramos de que el nivel esté entre 0 y 100
        if (nivelInicial < 0) {
            nivelInicial = 0;
        } else if (nivelInicial > 100) {
            nivelInicial = 100;
        }
        this.nivelBateria = nivelInicial;
    }

    @Override
    public void cargar() {
        if (nivelBateria >= 100) {
            System.out.println("La batería ya está completa.");
        } else {
            nivelBateria += 10;
            if (nivelBateria > 100) {
                nivelBateria = 100;
            }
            System.out.println("Cargando... batería al " + nivelBateria + "%");
        }
    }

    @Override
    public void usar() {
        if (nivelBateria <= 0) {
            System.out.println("Sin batería. Hay que cargar la linterna.");
        } else {
            nivelBateria -= 10;
            if (nivelBateria < 0) {
                nivelBateria = 0;
            }
            System.out.println("Usando la linterna... batería al " + nivelBateria + "%");
        }
    }

    public int getNivelBateria() {
        return nivelBateria;
    }
}

// Clase principal para probar (el nombre coincide con el archivo)
public class Ejercicio1Linterna {
    public static void main(String[] args) {
        Linterna linterna = new Linterna(30);

        System.out.println("Nivel inicial: " + linterna.getNivelBateria() + "%");

        linterna.usar();
        linterna.usar();
        linterna.usar();
        linterna.usar(); // ya sin batería

        linterna.cargar();
        linterna.cargar();

        System.out.println("Nivel final: " + linterna.getNivelBateria() + "%");
    }
}
