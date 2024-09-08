// Esta al tanto de los errores posibles del sistema de pago - no es necesario tenerlo
package Sistema_de_Pago;

public class Payment extends Exception {
    public Payment(String message) {
        super(message);
    }
}
