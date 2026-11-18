

public class PrincipalAlumno {
    public static void main(String[] args) {
        // Crear un objeto de tipo Alumno
        Alumno alumno1 = new Alumno("Ana", 20);
        Alumno alumno2 = new Alumno("Pepe", 23);
        // Mostrar los datos del alumno
       alumno1.mostrarDatos();
       alumno2.mostrarDatos();
        alumno1.setEdad(33);
 
        }

    
}
