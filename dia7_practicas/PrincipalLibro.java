

public class PrincipalLibro {
    public static void main(String[] args) {
        // Crear objetos de tipo Libro usando el constructor con parámetros
        Libro libro1 = new Libro("Libro1", "Autor1", 250);
        Libro libro2 = new Libro("Libro2", "Autor2", 300);

        // Crear un objeto usando el constructor vacío (valores por defecto)
        Libro libro3 = new Libro();

        // Mostrar los datos
        libro1.mostrarDatos();
        libro2.mostrarDatos();
        libro3.mostrarDatos();
    }
}