package Sistema_de_Pago;

// Valida si los datos son correctos o incorrectos
public class Paypal implements PaymentMethod {
    private String email;
    private String password;

    public Paypal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void authorizePayment(double amount) throws Payment {
        if (email.isEmpty() || password.isEmpty()) {
            throw new Payment("Email o contraseña de PayPal inválidos.");
        }
        if (amount <= 0) {
            throw new Payment("El monto debe ser mayor a 0.");
        }
        System.out.println("Authorizing PayPal payment for: " + amount);
    }

    @Override
    public void processPayment(double amount) throws Payment {
        System.out.println("Processing PayPal payment of: " + amount);
        System.out.println("PayPal payment processed successfully.");
    }
}
