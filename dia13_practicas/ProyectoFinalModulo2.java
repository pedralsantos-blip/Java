// Importamos ArrayList para almacenar nuestra lista dinámica de objetos Tarea
import java.util.ArrayList;
// Importamos Collections para ordenar las tareas por su prioridad
import java.util.Collections;
// 1. ENUM: Lista cerrada con los dos únicos estados posibles de una tarea
enum EstadoTarea {
 // La tarea aún está por realizar
 PENDIENTE,
 // La tarea ya se ha completado
 HECHA
// Cierra el enum EstadoTarea
}
// 2. INTERFAZ: Contrato que obliga a saber mostrarse por pantalla
interface Mostrable {
 // Método obligatorio sin cuerpo
 void mostrar();
// Cierra la interfaz Mostrable
}
// 3. CLASE POO: Implementa la interfaz Mostrable y encapsula sus datos
class Tarea implements Mostrable {
 // Atributo privado para el nombre de la tarea
 private String descripcion;
 // Atributo privado del tipo de nuestro enum EstadoTarea
 private EstadoTarea estado;
 // Atributo privado usando el Wrapper Integer (1 = muy urgente, 2 = media, 3 =
 // baja)
 private Integer prioridad;
 // Constructor completo de la clase Tarea
 public Tarea(String descripcion, EstadoTarea estado, Integer prioridad) {
 // Guarda la descripció
 this.descripcion = descripcion;
 // Guarda el estado recibido
 this.estado = estado;
 // Guarda el número de prioridad recibido
 this.prioridad = prioridad;
 // Cierra el constructor
 }
 // Getter público para poder consultar si la tarea está PENDIENTE o HECHA
 public EstadoTarea getEstado() {
 // Devuelve el estado actual
 return this.estado;
 // Cierra getEstado
 }
 // Getter público para consultar el número de prioridad al ordenar la lista
 public Integer getPrioridad() {
 // Devuelve el Integer de prioridad
 return this.prioridad;
 // Cierra getPrioridad
 }
 // Cumple el contrato de la interfaz Mostrable
 @Override
 // Imprime los tres datos del objeto Tarea en una sola línea clara
 public void mostrar() {
 // Ficha en consola
 System.out.println("Tarea: " + this.descripcion + " | Estado: "
 + this.estado + " | Prioridad: " + this.prioridad);
 // Cierra el método mostrar
 }
// Cierra la clase Tarea
}
// Clase principal ejecutable que integra todo el Módulo 2 (archivo
// ProyectoFinalModulo2.java)
public class ProyectoFinalModulo2 {
 // Punto de entrada del proyecto integrador
 public static void main(String[] args) {
 // 4. COLECCIÓN DINÁMICA: Creamos un ArrayList que guarda objetos de
 // nuestra propia clase 'Tarea':
 // Lista elástica de objetos Tarea
 ArrayList<Tarea> tareas = new ArrayList<Tarea>();
 // Fabricamos 3 objetos Tarea con 'new' y los metemos directamente en la
 // lista con .add():
 // Tarea con prioridad 3
 tareas.add(new Tarea("Preparar clase", EstadoTarea.PENDIENTE, 3));
 // Tarea con prioridad 2
 tareas.add(new Tarea("Corregir ejercicios", EstadoTarea.HECHA, 2));
 // Tarea con prioridad 1 (la más prioritaria)
 tareas.add(new Tarea("Subir materiales al servidor",
 EstadoTarea.PENDIENTE, 1));
 // 5. LAMBDA DE ORDENACIÓN: Ordenamos los objetos Tarea comparando su
 // atributo 'prioridad' de menor a mayor(1, 2, 3, )
 // Compara la prioridad del objeto 'a' con la del objeto 'b'
 Collections.sort(tareas, (a, b) -> a.getPrioridad() - b.getPrioridad());
 // Cabecera del informe
 System.out.println("=== PANEL DE TAREAS DEL SERVIDOR (ORDENADAS POR " +
 "PRIORIDAD) ===");
 // 6. BUCLE FOR Y CONDICIONAL IF: Recorremos la lista de objetos ya
 // ordenada:
 // Recorre las posiciones 0, 1 y 2 del ArrayList
 for (int i = 0; i < tareas.size(); i++) {
 // Extrae el objeto Tarea de la posición 'i' y llama a su método
 // .mostrar()
 tareas.get(i).mostrar();
 // Comprobamos con un if en qué estado del enum se encuentra esa tarea
 // concreta:
 // Si su estado es PENDIENTE:
 if (tareas.get(i).getEstado() == EstadoTarea.PENDIENTE) {
 // Mensaje de aviso
 System.out.println("[!] Estado: Aun queda por hacer.");
 // Si su estado es HECHA:
 } else {
 // Mensaje de confirmación
 System.out.println("[OK] Estado: Ya esta terminada.");
 // Cierra el condicional if-else
 }
 System.out.println("-------------------------------"
 // Línea separadora (decorativa)
 + "-------------------------------");
 // Cierra el bucle for
 }
 // Cierra el método main
 }
// Cierra la clase ProyectoFinalModulo2
}