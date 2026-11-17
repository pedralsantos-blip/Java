package dia6_practicas;

public class PrincipalCuenta {public static void main(String[] args) {
 // Fabricamos una cuenta: su saldo empieza valiendo 0.0 (valor por
 // defecto)
 Cuenta cuenta = new Cuenta();
 // Cantidad válida: pasa el filtro del if y el saldo sube a 100.0
 cuenta.ingresar(100);
 // Cantidad negativa: el if la rechaza y el saldo no cambia
 cuenta.ingresar(-500);
 // Si escribiéramos aquí cuenta.saldo = -99999; el programa NO compilaría:
 // saldo es private
 // Solo podemos consultar el saldo a través de la ventanilla getSaldo()
 System.out.println("Saldo actual: " + cuenta.getSaldo());
 }
// Cierra la clase PrincipalCuenta
}

    

