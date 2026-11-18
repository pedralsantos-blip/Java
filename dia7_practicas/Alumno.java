

// Define el molde 'Alumno' (archivo Alumno.java)
public class Alumno {
 // Atributo privado para guardar el nombre del alumno
 private String nombre;
 // Atributo privado para guardar la edad entera
 private int edad;
 // CONSTRUCTOR: Se ejecuta automáticamente al hacer 'new Alumno("Ana", 20)'
 public Alumno(String nombre, int edad) {
 // Asigna el parámetro recibido al atributo interno de este objeto
 this.nombre = nombre;
 // Asigna la edad recibida al atributo interno de este objeto
 this.edad = edad;
 // Cierra el constructor
 }
 // Getter: permite consultar la edad desde fuera
 public int getEdad() {
 return edad;
 }
 // Setter: permite cambiar la edad desde fuera
 public void setEdad(int edad) {
 this.edad = edad;
 }
void mostrarDatos() {
    System.out.println("Datos del alumno");
    System.out.println("================");
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);
// Cierra la clase Alumno
}
}

