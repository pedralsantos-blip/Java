public class PrincipalEvaluacion {
    public static void main(String[] args) {
        // 2.1 Instanciación
        ProductoServidor p1 = new ProductoServidor("Servidor Torre Pro", 1200.0, 5);
        ProductoServidor p2 = new ProductoServidor("Servidor Rack", 899.99, 5);
        p1.mostrarFicha();
        p2.mostrarFicha();

        // 2.2 Ventas
        p1.vender(2);   // cobra 2400.0 €, stock 3
        p2.vender(25);  // stock insuficiente

        // 2.3 Reposición y estado final
        p1.reponerStock(4);  // stock 7

        p1.mostrarFicha();
        p2.mostrarFicha();
    }
}

