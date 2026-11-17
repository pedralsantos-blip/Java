package dia6_practicas;

public class Coche {

    // Atributos privados: solo se pueden modificar desde dentro de esta clase
    private String marca;
    private String modelo;
    private int kilometros;

    // Constructor: da marca y modelo al crear el coche; los kilómetros empiezan en 0
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = 0;
    }

    // Suma la distancia a los kilómetros solo si es mayor que 0
    public void recorrerKilometros(int distancia) {
        if (distancia > 0) {
            kilometros += distancia;
        } else {
            System.out.println("Distancia no válida: " + distancia);
        }
    }

    // Imprime el estado actual del coche
    public void mostrarDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Kilómetros: " + kilometros);
        System.out.println("-------------------");
    }
}

