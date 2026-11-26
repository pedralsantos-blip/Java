
    import java.util.ArrayList;
// Importamos Collections para usar el método sort
import java.util.Collections;
// Clase para aprender a ordenar con una regla lambda (archivo
// EjemploLambdaBasica.java)
public class EjemploLambdaBasica {
 // Inicia el programa
 public static void main(String[] args) {
 // Creamos la lista dinámica de textos
 ArrayList<String> nombres = new ArrayList<String>();
 // Nombre de 4 letras
 nombres.add("Luis");
 // Nombre de 3 letras (deberá quedar el primero por ser el más corto)
 nombres.add("Ana");
 // Nombre de 5 letras
 nombres.add("Marta");
 // Nombre de 6 letras (deberá quedar el último por ser el más largo)
 nombres.add("Carlos");
 // Ordenamos la lista pasándole una regla LAMBDA como segundo argumento:
 // Java va tomando los nombres de dos en dos (los llama 'a' y 'b') y resta
 // sus longitudes (a.length() - b.length()).
 // Si la resta da negativo, significa que 'a' es más corto que 'b' y lo
 // coloca antes:
 // Ordena de menor a mayor longitud gracias a la lambda
 Collections.sort(nombres, (a, b) -> a.length() - b.length());
 // Cabecera en consola
 System.out.println("Nombres ordenados de más corto a más largo:");
 // Recorremos la lista ya ordenada
 for (int i = 0; i < nombres.size(); i++) {
 // Imprime en orden: Ana (3), Luis (4), Marta (5), Carlos (6)
 System.out.println(nombres.get(i));
 // Cierra el bucle for
 }
 // Cierra el método main
 }
// Cierra la clase EjemploLambdaBasica
}


