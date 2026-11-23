// Interfaz: define qué debe poder hacer cualquier "avisador" de la tienda
interface Avisador {
    void avisar();
}

class AltavozTienda implements Avisador {

    private String mensaje;

    public AltavozTienda(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void avisar() {
        System.out.println("[ALTAVOZ] Atención, clientes: " + mensaje);
    }
}

class PantallaTienda implements Avisador {

    private String mensaje;

    public PantallaTienda(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void avisar() {
        System.out.println("[PANTALLA] *** " + mensaje.toUpperCase() + " ***");
    }
}

// Clase principal para probar (el nombre coincide con el archivo)
public class Ejercicio3Tienda {
    public static void main(String[] args) {
        // Variables del tipo general (la interfaz), objetos de cada clase concreta
        Avisador altavoz = new AltavozTienda("La tienda cerrará en 10 minutos.");
        Avisador pantalla = new PantallaTienda("Oferta del día: 2x1 en toda la sección de plantas");

        altavoz.avisar();
        pantalla.avisar();

        System.out.println();

        // Una misma variable puede apuntar a objetos distintos
        Avisador aviso = new AltavozTienda("Se ha encontrado una cartera en caja.");
        aviso.avisar();

        aviso = new PantallaTienda("Se ha encontrado una cartera en caja.");
        aviso.avisar();

        System.out.println();

        // Array de tipo Avisador: se recorre sin importar qué clase es cada uno
        Avisador[] avisos = {
            new AltavozTienda("Promoción en la caja 3."),
            new PantallaTienda("Promoción en la caja 3."),
            new AltavozTienda("Gracias por su visita.")
        };

        System.out.println("--- Todos los avisos ---");
        for (Avisador a : avisos) {
            a.avisar();
        }
    }
}
