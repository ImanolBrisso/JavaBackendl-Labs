package Sistema_de_Pago;

import java.util.regex.Pattern;
// Aquí se verifica la validez de los datos (si son validos o inválidos)

public class CreditCard implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;

    public CreditCard(String cardNumber, String cardHolderName, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
    }

    @Override
    public void authorizePayment(double amount) throws Payment {
        if (!isValidCardNumber()) {
            throw new Payment("Número de tarjeta inválido.");
            // Tiene que estar correcto el formato y cantidad de números de tarjeta
        }
        if (amount <= 0) {
            throw new Payment("El monto debe ser mayor a 0.");
        }
        System.out.println("Authorizing credit card payment for: " + amount);
    }

    @Override
    public void processPayment(double amount) throws Payment {
        System.out.println("Processing credit card payment of: " + amount);
        System.out.println("Credit card payment processed successfully.");
    }

    private boolean isValidCardNumber() {
        // Aca se verifica el tipo de formato correcto a utilizar (formato 1234-5678-9012-3456)
        String regex = "^[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}$";
        return Pattern.matches(regex, this.cardNumber);
    }
}

