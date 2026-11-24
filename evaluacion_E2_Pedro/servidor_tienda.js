
// 1.1 Clase ProductoTienda
class ProductoTienda {
  constructor(nombre, precio, stock) {
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
  }

  calcularPrecioConIva() {
    return this.precio * 1.21;
  }
}

//Array catalogo de 4 productos
const productos=[
    new ProductoTienda("Portatil",700,8),
new ProductoTienda("Monitor",189.5,15),
new ProductoTienda("Teclado",39.99,30),
new ProductoTienda("Raton",14.99,10),
];

//Contador de visitas
let visitasTotales=0;

//Server HTTP
const http = require("http");

const servidor = http.createServer(function (req, res) {
  visitasTotales++;
  console.log(`Visita nº ${visitasTotales} | ${req.method} ${req.url}`);

  if (req.url === "/") {
    res.writeHead(200, { "Content-Type": "text/html; charset=utf-8" });
    res.write("<h1>Bit Informatica</h1>");
    res.write(`<p>Visitas totales: ${visitasTotales}</p>`);
    res.write("<ul>");
    res.write('<li><a href="/catalogo">Catálogo</a></li>');
    res.write('<li><a href="/ofertas">Ofertas</a></li>');
    res.write('<li><a href="/api/productos">API productos</a></li>');
    res.write('<li><a href="/api/estado">API estado</a></li>');
    res.write('<li><a href="/contacto">Contacto</a></li>');
    res.write("</ul>");
    res.end();

  } else if (req.url === "/catalogo") {
    res.writeHead(200, { "Content-Type": "text/html; charset=utf-8" });
    res.write("<h1>Catálogo completo</h1>");
    for (let i = 0; i < productos.length; i++) {
      const p = productos[i];
      res.write(`<h3>${p.nombre}</h3>`);
      res.write(`<p>Stock: ${p.stock} unidades</p>`);
      res.write(`<p>Precio base: ${p.precio.toFixed(2)} €</p>`);
      res.write(`<p>Precio con IVA: ${p.calcularPrecioConIva().toFixed(2)} €</p>`);
    }
    res.write('<p><a href="/">Volver al inicio</a></p>');
    res.end();

  } else if (req.url === "/ofertas") {
    res.writeHead(200, { "Content-Type": "text/html; charset=utf-8" });
    res.write("<h1>Ofertas en productos </h1>");
    for (let i = 0; i < productos.length; i++) {
      if (productos[i].precio < 100) {
        res.write(
          `<p>${productos[i].nombre}: ${productos[i].precio.toFixed(2)} €</p>`
        );
      }
    }
    res.write('<p><a href="/">Volver al inicio</a></p>');
    res.end();

  } else if (req.url === "/contacto") {
    res.writeHead(200, { "Content-Type": "text/html; charset=utf-8" });
    res.write("<h1>Atención al Cliente y Soporte Técnico</h1>");
    res.write("<p>Contacto: info@bitinformatica.org</p>");
    res.write("<p>Teléfono: 955 000 000</p>");
    res.write("<p>Horario: lunes a viernes, de 9:00 a 20:00</p>");
    res.write('<p><a href="/">Volver al inicio</a></p>');
    res.end();

  } else if (req.url === "/api/productos") {
    res.writeHead(200, { "Content-Type": "application/json; charset=utf-8" });
    res.end(JSON.stringify(productos));

    //API REST
  } else if (req.url === "/api/estado") {
    const estadoServidor = {
      tienda: "Bit informatica",
      estado: "Operativo",
      puerto: 3000,
      visitas: visitasTotales,
    };
    res.writeHead(200, { "Content-Type": "application/json; charset=utf-8" });
    res.end(JSON.stringify(estadoServidor));
  } else {
    res.writeHead(404, { "Content-Type": "text/html; charset=utf-8" });
    res.write("<h1>Error 404: Página no encontrada en el servidor</h1>");
    res.write(`<p>La ruta solicitada no existe: ${req.url}</p>`);
    res.write('<p><a href="/">Volver al inicio</a></p>');
    res.end();
  }
});

servidor.listen(3000, function () {
  console.log("Servidor escuchando en http://localhost:3000");
});