package Sistema_de_Pago;

public interface PaymentMethod {
    void authorizePayment(double amount) throws Payment; // es lo que autoriza el pago
    void processPayment(double amount) throws Payment; // es lo que procesa el pago
}
