package Sistema_de_Pago;

// Se selecciona el método de pago, el ingreso de datos del usuario y se verifican si todos los datos son correctos
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentMethod paymentMethod = null;

        System.out.println("Seleccione el método de pago:");
        System.out.println("1. Tarjeta de Crédito");
        System.out.println("2. PayPal");

        int choice = scanner.nextInt();
        scanner.nextLine();

        try {
            switch (choice) {
                case 1:
                    System.out.println("Ingrese el número de tarjeta:");
                    String cardNumber = scanner.nextLine();
                    System.out.println("Ingrese el nombre del titular:");
                    String cardHolderName = scanner.nextLine();
                    System.out.println("Ingrese la fecha de expiración (MM/AA):");
                    String expirationDate = scanner.nextLine();

                    paymentMethod = new CreditCard(cardNumber, cardHolderName, expirationDate);
                    break;

                case 2:
                    System.out.println("Ingrese su email de PayPal:");
                    String email = scanner.nextLine();
                    System.out.println("Ingrese su contraseña de PayPal:");
                    String password = scanner.nextLine();

                    paymentMethod = new Paypal(email, password);
                    break;

                default:
                    throw new IllegalArgumentException("Opción no válida.");
            }

            System.out.println("Ingrese el monto a pagar:");
            double amount = scanner.nextDouble();

            // Autorizar y procesar el pago
            paymentMethod.authorizePayment(amount);
            paymentMethod.processPayment(amount);

        } catch (Payment e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado: " + e.getMessage());
        }
    }
}

