package dia6_practicas;

import java.math.BigDecimal;

public class PrincipalLibro {  public static void main(String[] args) {

        // Primer libro: se crea con new y se rellena con los setters
        Libro libro1 = new Libro();
        libro1.setTitulo("La dinastia entre la servidumbre");
        libro1.setAutor("Cuspide");
        libro1.setPaginas(863);
       libro1.setISBN("39475394857394");
      libro1.setPrecio(new BigDecimal("19.95"));

        // Segundo libro, distinto del primero
        Libro libro2 = new Libro();
        libro2.setTitulo("Derecho romano para enanos de jardin");
        libro2.setAutor("Azahot");
        libro2.setPaginas(471);
         libro2.setISBN("978839");
       libro2.setPrecio(new BigDecimal("19.95"));

        //Tercer libro distinto a todos los demas 
         Libro libro3 = new Libro();
        libro3.setTitulo("Tratado sobre la gravedad en los enchufes");
        libro3.setAutor("Kitty");
        libro3.setPaginas(250);
        libro3.setISBN("23982398");
        libro3.setPrecio(new BigDecimal("19.95"));

         //Cuarto  libro distinto a todos los demas 
         Libro libro4 = new Libro();
        libro4.setTitulo("Hechicerias varias concentradas en cocretas (IV Edición)");
        libro4.setAutor("Mayka");
        libro4.setPaginas(450);
        libro4.setISBN("34534534");
        libro4.setPrecio(new BigDecimal("19.95"));

        // Se muestra la ficha de cada uno
        libro1.mostrarFicha();
        libro2.mostrarFicha();
        libro3.mostrarFicha();
        libro4.mostrarFicha();
       
    }

public PrincipalLibro() {
}
}
    

