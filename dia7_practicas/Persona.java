public class Persona {
    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor completo: recibe nombre y edad
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor abreviado: solo el nombre, la edad se asigna a 0
    public Persona(String nombre) {
        this(nombre, 0);
    }

    // Muestra los datos de la persona por consola
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("----------------");
    }
}
