
// Define la clase CuentaBancaria (archivo CuentaBancaria.java)
public class CuentaBancaria {
 // Titular de la cuenta
 private String titular;
 // Saldo actual
 private double saldo;
 // Constructor para crear la cuenta con su titular y saldo inicial
 public CuentaBancaria(String titular, double saldoInicial) {
 // Guarda el titular
 this.titular = titular;
 // Valida que el saldo inicial no sea negativo
 if (saldoInicial >= 0) {
 // Guarda el saldo válido
 this.saldo = saldoInicial;
 } else {
 // Si era negativo, empieza en cero
 this.saldo = 0.0;
 }
 // Cierra el constructor
 }
 // Método de instancia para añadir dinero
 public void ingresar(double cantidad) {
 if (cantidad > 0) {
 // Suma la cantidad al saldo de este objeto concreto
 this.saldo += cantidad;
 }
 // Cierra ingresar
 }
 // Método de instancia para imprimir el estado de la cuenta
 public void mostrarSaldo() {
 System.out.println("Titular: " + this.titular + " | Saldo actual: "
 + this.saldo + " €");
 // Cierra mostrarSaldo
 }
// Cierra la clase CuentaBancaria
}
