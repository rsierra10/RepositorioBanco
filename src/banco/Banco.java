/*
 * EjemploCodigo.com
 * 
 * 
 */
package banco;

/**
 *
 * @author Javier Crego
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        double totalCuenta;

        // Creamos la cuenta
        Cuenta Cuenta1;
        Cuenta1 = new Cuenta(11111, 2500.70);

        // Consultamos el saldo
        totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + " €");

        // hacemos un ingreso en la cuenta
        double ingreso = 350.25;
        System.out.println("Se ingresan en la cuenta: " + ingreso + " €");
        Cuenta1.depositar(ingreso);
        
        System.out.println("-------------------------------------------------");

        // Consultamos el saldo de nuevo
        totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + " €");        
        
    }
    
}
