package dia5_practicas;

public class RecorridoConFor {// Inicia el método principal
 public static void main(String[] args) {
 // Declaramos un array con 5 notas (notas.length vale 5, y sus índices van
 // del 0 al 4)
 int[] notas = {6, 8, 5, 9, 7};
 // Empezamos en i = 0; repetimos mientras i sea MENOR ESTRICTO (<) que 5
 // (llega hasta 4); subimos de 1 en 1
 for (int i = 0; i < notas.length; i++) {
 // En cada vuelta, 'notas[i]' lee la casilla correspondiente al número
 // de vuelta actual
 System.out.println("Posición " + i + ": " + notas[i]);
 // Cierra el bucle for tras haber mostrado las posiciones 0, 1, 2, 3 y 4
 }
 // Cierra el método main
 }
// Cierra la clase RecorridoConFor
}

    

