/ Interfaz: todo pedido debe poder entregarse e indicar si es urgente
interface Entregable {
    void entregar();
    boolean esUrgente();
}

class PedidoNormal implements Entregable {

    private int numero;

    public PedidoNormal(int numero) {
        this.numero = numero;
    }

    @Override
    public void entregar() {
        System.out.println("Pedido normal #" + numero + " entregado en 48 horas.");
    }

    @Override
    public boolean esUrgente() {
        return false;
    }
}

class PedidoUrgente implements Entregable {

    private int numero;

    public PedidoUrgente(int numero) {
        this.numero = numero;
    }

    @Override
    public void entregar() {
        System.out.println("Pedido urgente #" + numero + " entregado en menos de 24 horas.");
    }

    @Override
    public boolean esUrgente() {
        return true;
    }
}

// Clase principal para probar (el nombre coincide con el archivo)
public class Ejercicio7Reparto {
    public static void main(String[] args) {
        Entregable[] pedidos = {
            new PedidoNormal(101),
            new PedidoUrgente(102),
            new PedidoNormal(103),
            new PedidoUrgente(104),
            new PedidoNormal(105)
        };

        System.out.println("--- Reparto del día ---");
        for (int i = 0; i < pedidos.length; i++) {
            if (pedidos[i].esUrgente()) {
                System.out.println("¡¡ATENCIÓN!! PEDIDO URGENTE: prioridad máxima en el reparto.");
            }
            pedidos[i].entregar();
        }
    }
}
