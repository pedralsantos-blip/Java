// Clase abstracta: no se puede hacer new AnimalGranja(...)
abstract class AnimalGranja {

    protected String nombre;
    protected double peso; // en kg

    public AnimalGranja(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    // Método completo: lo heredan todas las subclases tal cual
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " | Peso: " + peso + " kg");
    }

    // Método abstracto: cada subclase está obligada a escribirlo
    public abstract void hacerSonido();
}

class Oveja extends AnimalGranja {

    public Oveja(String nombre, double peso) {
        super(nombre, peso);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Beeee!");
    }
}

class Vaca extends AnimalGranja {

    public Vaca(String nombre, double peso) {
        super(nombre, peso);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Muuuu!");
    }
}

// Clase principal para probar (el nombre coincide con el archivo)
public class Ejercicio2Granja {
    public static void main(String[] args) {
        Oveja oveja = new Oveja("Lola", 65.5);
        Vaca vaca = new Vaca("Paca", 550);

        oveja.mostrarDatos();
        oveja.hacerSonido();

        System.out.println();

        vaca.mostrarDatos();
        vaca.hacerSonido();

        System.out.println();

        // Polimorfismo: un mismo array con animales distintos
        AnimalGranja[] granja = { oveja, vaca, new Oveja("Nube", 58.2) };
        System.out.println("--- Toda la granja ---");
        for (AnimalGranja animal : granja) {
            animal.mostrarDatos();
            animal.hacerSonido();
        }
    }
}
