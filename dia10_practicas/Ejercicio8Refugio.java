/ Clase abstracta: no se puede hacer new Mascota(...)
abstract class Mascota {

    protected String nombre;
    protected int edad; // en años

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método completo: lo heredan las subclases tal cual
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " años");
    }

    // Método abstracto: cada subclase está obligada a escribirlo
    public abstract void hacerSonido();
}

class PerroRefugio extends Mascota {

    public PerroRefugio(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau, guau!");
    }
}

class GatoRefugio extends Mascota {

    public GatoRefugio(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau!");
    }
}

// Clase principal para probar (el nombre coincide con el archivo)
public class Ejercicio8Refugio {
    public static void main(String[] args) {
        Mascota[] mascotas = {
            new PerroRefugio("Rex", 4),
            new GatoRefugio("Luna", 2),
            new PerroRefugio("Toby", 7),
            new GatoRefugio("Misi", 1)
        };

        System.out.println("--- Mascotas del refugio ---");
        for (Mascota m : mascotas) {
            m.mostrarDatos();
            m.hacerSonido();
            System.out.println();
        }
    }
}
