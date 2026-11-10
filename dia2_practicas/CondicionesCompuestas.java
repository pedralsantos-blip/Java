package dia2_practicas;

public class CondicionesCompuestas {
 // Inicia el método principal
 public static void main(String[] args) {
 // Guarda la calificación obtenida por el alumno (supera el 5)
 double nota = 6.5;
 // Guarda el porcentaje de asistencia a clase (supera el 80%)
 int asistencia = 85;
 // Evalúa con && si cumple la nota Y ADEMÁS la asistencia; como ambas son
 // ciertas, guarda true
 boolean aprueba = (nota >= 5) && (asistencia >= 80);
 // Evalúa con || si ha fallado en la nota O BIEN en la asistencia; como no
 // falla en ninguna, guarda false
 boolean recupera = (nota < 5) || (asistencia < 80);
 // Muestra por consola el resultado verdadero: true
 System.out.println("¿Supera el módulo?: " + aprueba);
 // Muestra por consola el resultado falso: false
 System.out.println("¿Debe ir a recuperación?: " + recupera);
 // Cierra el método main
 }
// Cierra la clase CondicionesCompuestas
}

    

