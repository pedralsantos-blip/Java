package dia8_practicas;

public class PersonaConToString {// Atributo privado para el nombre
 private String nombre;
 // Atributo privado para la edad
 private int edad;
 // Constructor para inicializar el objeto al hacer new
 public PersonaConToString(String nombre, int edad) {
 // Guarda el nombre
 this.nombre = nombre;
 // Guarda la edad
 this.edad = edad;
 // Cierra el constructor
 }
 // Esta etiqueta (@Override) le avisa a Java de que estamos personalizando el
 // método toString() que todos los objetos traen de fábrica
 @Override
 // Debe llamarse exactamente 'toString()' y devolver un 'String' con el texto
 // que queramos mostrar
 public String toString() {
 // Construye y devuelve una frase clara con los datos internos del objeto
 return "Persona{nombre='" + this.nombre + "', edad=" + this.edad + "}";
 // Cierra el método toString
 }
// Cierra la clase PersonaConToString
}
    

