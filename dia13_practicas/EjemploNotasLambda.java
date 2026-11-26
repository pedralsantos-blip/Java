
import java.util.ArrayList;
// Importamos Collections para ordenar la lista
import java.util.Collections;
// Clase para usar lambdas con listas (archivo EjemploNotasLambda.java)
public class EjemploNotasLambda {
 // Inicia el programa
 public static void main(String[] args) {
 // Lista dinámica de notas enteras
 ArrayList<Integer> notas = new ArrayList<Integer>();
 notas.add(6);
 notas.add(9);
 notas.add(4);
 notas.add(7);
 notas.add(3);
 // b - a: de mayor a menor (al revés que a - b)
 Collections.sort(notas, (a, b) -> b - a);
 // Muestra la lista ya ordenada
 System.out.println("Notas de mayor a menor: " + notas);
 // forEach recorre la lista y ejecuta la lambda con cada elemento (al que
 // llama 'n'):
 // Hace lo mismo que un for que imprime cada nota
 notas.forEach(n -> System.out.println("Nota: " + n));
 // removeIf borra todos los elementos para los que la lambda devuelve
 // true:
 // Borra las notas menores que 5
 notas.removeIf(n -> n < 5);
 // Muestra la lista sin suspensos
 System.out.println("Solo aprobados: " + notas);
 // Cierra el método main
 }
// Cierra la clase EjemploNotasLambda
}