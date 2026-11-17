package dia6_practicas;

public class Cuenta {// Define el molde de una Cuenta bancaria protegida mediante encapsulación
// (archivo Cuenta.java)
 // Al poner 'private', blindamos el saldo: queda prohibido hacer 'cuenta.saldo
 // = ...' desde fuera de esta clase
 private double saldo;
 // Método público que actúa como ventanilla segura para meter dinero en la
 // cuenta
 public void ingresar(double cantidad) {
 // Filtro de seguridad: solo aceptamos el ingreso si la cantidad es
 // estrictamente mayor que cero
 if (cantidad > 0) {
 // Como estamos DENTRO de la propia clase Cuenta, aquí sí tenemos
 // permiso para sumar al atributo 'saldo'
 saldo = saldo + cantidad;
 // Si alguien intenta ingresar una cantidad negativa (ej. -500), el if no
 // se cumple y el saldo queda protegido sin cambios
 }
 // Cierra el método ingresar
 }
 // Método público de consulta (Getter): permite mirar cuánto saldo hay sin
 // permitir modificarlo a lo loco
 public double getSaldo() {
 // La palabra 'return' devuelve hacia fuera el valor actual guardado en el
 // atributo 'saldo'
 return saldo;
 // Cierra el método getSaldo
 }
// Cierra la clase Cuenta
}

    

