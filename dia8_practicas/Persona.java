package dia8_practicas;

public class Persona {//ibuto privado para el nombre
 private String nombre;
 // Atributo privado para la edad
 private int edad;
 // GETTER de nombre: devuelve un String y no necesita recibir nada entre
 // paréntesis
 public String getNombre() {
 // Devuelve el nombre actual guardado en el objeto
 return this.nombre;
 // Cierra getNombre
 }
 // SETTER de nombre: no devuelve nada (void) y recibe el nuevo nombre por
 // parámetro
 public void setNombre(String nombre) {
 // Actualiza el atributo interno con el nuevo valor recibido
 this.nombre = nombre;
 // Cierra setNombre

 }
 // GETTER de edad: permite consultar la edad desde fuera de la clase
 public int getEdad() {
 // Devuelve el número entero guardado en el atributo 'edad'
 return this.edad;
 // Cierra getEdad
 }
 // SETTER de edad: protege el atributo impidiendo edades negativas
 public void setEdad(int edad) {
 // Validación de seguridad: solo aceptamos el cambio si la edad es cero o
 // positiva
 if (edad >= 0) {
 // Guarda la nueva edad válida dentro del objeto
 this.edad = edad;
 // Si alguien intenta hacer persona.setEdad(-5), el if lo ignora y protege
 // el dato anterior
 }
 // Cierra setEdad
 }
// Cierra la clase Persona
}
    

