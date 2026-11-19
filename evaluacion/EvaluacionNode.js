class ProductoNode {
    constructor(nombre, precio, stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    mostrarFicha() {
        console.log(`Producto: ${this.nombre} | Precio: ${this.precio.toFixed(2)} € | Stock: ${this.stock} uds.`);
    }

    aplicarDescuento(porcentaje) {
        this.precio = this.precio - (this.precio * porcentaje / 100);
    }
}

// 3.2 Creación y prueba de objetos
const p1 = new ProductoNode("Servidor Torre Pro", 1200.0, 5);
const p2 = new ProductoNode("Servidor Rack", 899.99, 5);

console.log("--- Fichas iniciales ---");
p1.mostrarFicha();
p2.mostrarFicha();

console.log("--- Tras aplicar un 10% de descuento al primero ---");
p1.aplicarDescuento(10);
p1.mostrarFicha();precio: 1080