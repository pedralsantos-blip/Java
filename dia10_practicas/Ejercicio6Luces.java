// Interfaz: todo lo que se pueda encender debe tener encender()
interface Encendible {
    void encender();
}

class Lampara implements Encendible {

    @Override
    public void encender() {
        System.out.println("La lámpara se enciende: luz cálida en el salón.");
    }
}

class Farola implements Encendible {

    @Override
    public void encender() {
        System.out.println("La farola se enciende: ilumina la calle.");
    }
}

class Televisor implements Encendible {

    @Override
    public void encender() {
        System.out.println("El televisor se enciende: aparece la pantalla de inicio.");
    }
}

// Clase principal para probar (el nombre coincide con el archivo)
public class Ejercicio6Luces {
    public static void main(String[] args) {
        Encendible[] aparatos = {
            new Lampara(),
            new Farola(),
            new Televisor(),
            new Lampara(),
            new Farola()
        };

        System.out.println("--- Encendiendo todo ---");
        for (int i = 0; i < aparatos.length; i++) {
            aparatos[i].encender();
        }
    }
}
