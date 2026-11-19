package dia8_practicas;
public class PrincipalAlumno {
 public static void main(String[] args) {
 // Cada new ejecuta el constructor y hace totalAlumnos++ sobre la MISMA
 // casilla
 new Alumno("Ana");
 Alumno a2 = new Alumno("Luis");
 new Alumno("Marta");
 // Método de INSTANCIA: se pide a un objeto concreto
 System.out.println("Nombre del segundo alumno: " + a2.getNombre());
 // Método de CLASE: se llama con el nombre de la clase y devuelve 3
 System.out.println("Alumnos matriculados: " + Alumno.getTotalAlumnos());
 }
}