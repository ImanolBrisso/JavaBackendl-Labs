import java.util.Scanner;

public class Palindromo {
    // "Un palíndromo es una secuencia de caracteres que se lee igual
    // hacia adelante que hacia atrás, ignorando espacios, signos de puntuación y mayúsculas."
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra o frase: ");
        String entrada = scanner.nextLine(); // comprobar algun tipo de conversion de palabra para que se pueda validar igualmente


        boolean esPalindromo = true; // lo mismo que para los numeros primos se utiliza el "true" o "false" para verificar - boolean
        for (int i = 0; i < entrada.length() / 2; i++) {
            if (entrada.charAt(i) != entrada.charAt(entrada.length() - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        // Probar resultado con el uso de "break" o "return" y verificarlo antes
        if (esPalindromo) {
            System.out.println("La palabra es un palindromo");
        } else {
            System.out.println("La palabra no es un palindromo");
        }

        scanner.close();
    }
}
