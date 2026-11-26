// Array de nombres en Node.js
const nombres = ["Luis", "Ana", "Marta", "Carlos"];
// En Java escribíamos: (a, b) -> a.length() - b.length()
// En Node.js cambiamos '->' por '=>' y length() por length (sin paréntesis):
// Ordena de más corto a más largo con una función flecha (lambda)
nombres.sort((a, b) => a.length - b.length);
// Muestra: ['Ana', 'Luis', 'Marta', 'Carlos']
console.log("Ordenados por longitud con lambda en Node.js:", nombres);
// Y para programar una tarea dentro de 1 segundo sin bloquear el programa usamos
// también una lambda () => { ... }:
// Recibe la lambda con la tarea que se ejecutará más tarde
setTimeout(() => {
 // Se ejecuta pasado 1 segundo, sin bloquear el programa
 console.log("Tarea asíncrona completada en el servidor Node.js.");
// 1000 milisegundos = 1 segundo
}, 1000);