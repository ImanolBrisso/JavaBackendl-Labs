import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        int factorial = 1;  // se procede con el calculo del factorial para posteriormente imprimirlo
        for (int i = 1; i <= numero; i++) {
            factorial *= i; // se debe multiplicar ya que es factorial
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);

        scanner.close();
    }
}
