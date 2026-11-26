// Importamos de forma estática el método sqrt de la clase Math
import static java.lang.Math.sqrt;
// Clase de demostración (archivo EjemploStaticImport.java)
public class EjemploStaticImport {
 // Inicia el programa
 public static void main(String[] args) {
 // Gracias al 'import static' de arriba, podemos llamar a sqrt(25)
 // directamente sin escribir Math.sqrt(25):
 // Muestra 5.0
 System.out.println("Raíz cuadrada directa: " + sqrt(25));
 // Cierra el método main
 }
// Cierra la clase EjemploStaticImport
}