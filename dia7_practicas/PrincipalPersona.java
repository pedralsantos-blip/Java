public class PrincipalPersona {
 public static void main(String[] args) {
        // Persona creada con el constructor completo
        Persona persona1 = new Persona("Ana", 30);

        // Persona creada con el constructor abreviado (edad = 0)
        Persona persona2 = new Persona("Luis");

        // Mostrar los datos
        persona1.mostrarDatos();
        persona2.mostrarDatos();
    }
}