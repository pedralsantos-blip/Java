

// Define el molde 'Libro' (archivo Libro.java)
public class Libro {
    // Atributo privado para el título
    private String titulo;
    // Atributo privado para el autor
    private String autor;
    // Atributo privado para el número de páginas
    private int paginas;

    // 1. Constructor vacío: asigna valores predeterminados
    public Libro() {
        this("Sin título", "Desconocido", 0);
    }

    // 2. Constructor completo: inicializa los tres atributos con datos reales
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // 3. Muestra los datos del libro por consola
    public void mostrarDatos() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        System.out.println("----------------");
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }
}

