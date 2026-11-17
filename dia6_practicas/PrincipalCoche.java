package dia6_practicas;

public class PrincipalCoche {

    public static void main(String[] args) {


        // Dos coches distintos
        Coche coche1 = new Coche("Seat", "Ibiza");
        Coche coche2 = new Coche("Toyota", "Corolla");

        // El primer coche hace varios trayectos
        coche1.recorrerKilometros(120);
        coche1.recorrerKilometros(80);
        coche1.recorrerKilometros(-10); // no válido: se ignora

        // El segundo coche también recorre kilómetros
        coche2.recorrerKilometros(300);
        coche2.recorrerKilometros(0);   // no válido: se ignora
        coche2.recorrerKilometros(45);

        // Estado final de cada coche
        coche1.mostrarDatos();
        coche2.mostrarDatos();
    }
}
    

