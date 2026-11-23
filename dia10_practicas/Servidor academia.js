// Servidor web de la academia con el módulo http de Node.js (sin instalar nada)
const http = require('http');

const PUERTO = 3000;

// Pequeña función para no repetir el HTML base en cada ruta
function pagina(titulo, contenido) {
    return `<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>${titulo}</title>
</head>
<body>
    <h1>${titulo}</h1>
    ${contenido}
    <hr>
    <p><a href="/">Inicio</a> | <a href="/cursos">Cursos</a> | <a href="/horario">Horario</a></p>
</body>
</html>`;
}

const servidor = http.createServer((req, res) => {
    // Quitamos lo que venga después de "?" para que /cursos?x=1 también funcione
    const ruta = req.url.split('?')[0];

    let codigo;
    let html;

    if (ruta === '/') {
        codigo = 200;
        html = pagina(
            'Bienvenido a la Academia',
            '<p>Aquí encontrarás nuestros cursos y horarios.</p>'
        );
    } else if (ruta === '/cursos') {
        codigo = 200;
        html = pagina(
            'Cursos',
            `<ul>
        <li>HTML y CSS</li>
        <li>JavaScript</li>
        <li>Java</li>
        <li>WordPress</li>
    </ul>`
        );
    } else if (ruta === '/horario') {
        codigo = 200;
        html = pagina(
            'Horario',
            `<ul>
        <li>Lunes: HTML y CSS, 9:00 a 11:00</li>
        <li>Martes: JavaScript, 9:00 a 11:00</li>
        <li>Miércoles: Java, 9:00 a 11:00</li>
        <li>Jueves: WordPress, 9:00 a 11:00</li>
        <li>Viernes: Prácticas, 9:00 a 11:00</li>
    </ul>`
        );
    } else {
        codigo = 404;
        html = pagina(
            'Error 404',
            `<p>La página "${ruta}" no existe en la academia.</p>`
        );
    }

    // Cabecera con el código y el tipo de contenido (utf-8 para las tildes)
    res.writeHead(codigo, { 'Content-Type': 'text/html; charset=utf-8' });
    res.end(html);
});

servidor.listen(PUERTO, () => {
    console.log(`Servidor de la academia en http://localhost:${PUERTO}`);
});