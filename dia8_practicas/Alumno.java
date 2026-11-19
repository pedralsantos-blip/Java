package dia8_practicas;

public class Alumno {
//tributo de INSTANCIA (sin static): 
    //cada alumno creado tendrá su propia
 // casilla 'nombre' individual
 private String nombre;
 // Atributo de CLASE (con static): existe una ÚNICA casilla compartida para
 // contar cuántos alumnos se han creado en total
 private static int totalAlumnos = 0;
 // Constructor que se ejecuta cada vez que nace un alumno nuevo con 'new
 // Alumno(...)'
 public Alumno(String nombre) {
 // Guarda el nombre individual de este alumno concreto
 this.nombre = nombre;
 // Incrementa en 1 el contador global compartido de la clase cada vez que
 // se fabrica un alumno
 totalAlumnos++;
 // Cierra el constructor
 }
 // Método de instancia (sin static): devuelve el nombre de un alumno concreto

 public String getNombre() {
 // Retorna el atributo individual de ese objeto
 return this.nombre;
 // Cierra getNombre
 }
 // Método de CLASE (con static): permite consultar el contador general sin
 // depender de un alumno concreto
 public static int getTotalAlumnos() {
 // Devuelve el valor actual del contador compartido por toda la clase
 // Alumno
 return totalAlumnos;
 // Cierra getTotalAlumnos
 }
// Cierra la clase Alumno
}
    

