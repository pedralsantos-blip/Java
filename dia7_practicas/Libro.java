

// Define el molde 'Libro' (archivo Libro.java)
public class Libro {
 // Atributo privado para el título
 private String titulo;
 // Atributo privado para el autor
 private String autor;
 // Atributo privado para el número de páginas
 private int paginas;
 // 1. Constructor vacío por defecto: si no nos dan datos, asigna valores
 // predeterminados
 public Libro() {
 // Llama al constructor completo de abajo pasando estos valores por
 // defecto
 this("Sin título", "Desconocido", 0);
 // Cierra el constructor vacío
 }
 // 2. Constructor completo: inicializa los tres atributos con datos reales
 public Libro(String titulo, String autor, int paginas) {
 // Guarda el título
 this.titulo = titulo;
 // Guarda el autor
 this.autor = autor;
 // Guarda las páginas
 this.paginas = paginas;
 // Cierra el constructor completo
 }
// Cierra la clase Libro
}