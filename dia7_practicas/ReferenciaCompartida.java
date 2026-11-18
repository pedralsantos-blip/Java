public class ReferenciaCompartida {
    public static void main(String[] args) {
        // Se crea UN solo objeto Rectangulo y r1 apunta a él
        Rectangulo r1 = new Rectangulo(5, 3);

        // r2 no crea un objeto nuevo: copia la referencia, apunta al mismo objeto
        Rectangulo r2 = r1;

        System.out.println("Antes del cambio (r1):");
        r1.mostrarDatos();

        // Cambiamos la base a través de r2
        r2.setBase(10);

        // Mostramos a través de r1: refleja el cambio hecho desde r2
        System.out.println("Después de cambiar la base con r2 (mostrando r1):");
        r1.mostrarDatos();

        // Comprobación extra: ambas referencias apuntan al mismo objeto
        System.out.println("¿r1 y r2 son el mismo objeto? " + (r1 == r2));
    }
    
}
