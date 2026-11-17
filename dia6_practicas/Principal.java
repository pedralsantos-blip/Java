package dia6_practicas;

public class Principal {
    // Define la clase principal que arranca el programa (se guarda en otro archivo
// llamado Principal.java)
 // Punto de entrada donde comienza la ejecución en el servidor
 public static void main(String[] args) {
 // Con 'new Alumno()' fabricamos un objeto real en memoria a partir del
 // molde y lo llamamos 'alumno1'
 Alumno alumno1 = new Alumno();
 // Usamos el punto (.) para entrar en 'alumno1' y guardar "Ana" dentro de
 // su atributo 'nombre'
 alumno1.nombre = "Ana";
 // Guardamos el número 21 dentro del atributo 'edad' perteneciente a
 // 'alumno1'
 alumno1.edad = 21;
 // Guardamos el decimal 8.4 dentro del atributo 'notaMedia' de 'alumno1'
 alumno1.notaMedia = 8.4;
 // Le ordenamos al objeto 'alumno1' que ejecute su acción mostrarDatos()
 // para ver su ficha en pantalla
 Alumno alumno2=new Alumno();
 alumno2.nombre="juan";
 alumno2.edad=22;
 alumno2.notaMedia=7.5;

 alumno1.mostrarDatos();
 alumno2.mostrarDatos();
 // Cierra el método principal main
 }
// Cierra la clase Principal
}

    

