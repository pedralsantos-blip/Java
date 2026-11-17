package dia6_practicas;

public class Alumno {
    // Atributo de texto: indica que todo objeto Alumno tendrá una casilla propia
 // para guardar su nombre
 String nombre;
 // Atributo entero: indica que todo objeto Alumno tendrá una casilla para
 // guardar su edad
 int edad;
 // Atributo decimal: indica que todo objeto Alumno podrá almacenar sur
 // calificación media
 double notaMedia;
 // Método (acción): define un comportamiento para que cada alumno sepa
 // imprimir sus propios datos por consola
 void mostrarDatos() {
 // Muestra el contenido del atributo 'nombre' que tenga ese alumno
 // concreto
 System.out.println("Nombre: " + nombre);
 // Muestra el contenido del atributo 'edad' de ese alumno concreto
 System.out.println("Edad: " + edad);
 // Muestra el contenido del atributo 'notaMedia' de ese alumno concreto
 System.out.println("Nota media: " + notaMedia);
 // Cierra el método mostrarDatos
 }
// Cierra la definición de la clase (molde) Alumno
}
    

