
package dia6_practicas;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Libro {  // Atributos privados: solo se pueden tocar desde dentro de esta clase
    private String titulo;
    private String autor;
    private String ISBN;
   private BigDecimal precio;


    private int paginas;

    // Setters: dan valor a cada atributo desde fuera
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public void setISBN(String ISBN){
        this.ISBN=ISBN;
    }
  public void setPrecio(BigDecimal precio) {
    if (precio.compareTo(BigDecimal.ZERO) >= 0) {
        this.precio = precio.setScale(2, RoundingMode.HALF_UP);
    }
}
    // Imprime por pantalla los datos del libro
    public void mostrarFicha() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        System.out.println("ISBN:" +ISBN);
       System.out.println("Precio: " + precio + " euros");
        System.out.println("--+------_-_-_------+---");
    }
   
    }

    

