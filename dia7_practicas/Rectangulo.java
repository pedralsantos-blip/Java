public class Rectangulo {
    // Atributos privados
    private double base;
    private double altura;

    // Constructor: inicializa base y altura
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Permite cambiar la base
    public void setBase(double base) {
        this.base = base;
    }

    // Muestra la base y la altura por consola
    public void mostrarDatos() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("----------------");
    }
    
}
