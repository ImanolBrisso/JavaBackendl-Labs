import java.util.Scanner;

public class InvertirCadena {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();

        String cadenaInvertida = ""; // Cadena Invertida, se convierte abajo

        for (int i = cadena.length() - 1; i >= 0; i--) { // se invierte la cadena
            cadenaInvertida += cadena.charAt(i);
        }

        System.out.println("Cadena invertida: " + cadenaInvertida);

        scanner.close();
    }
}

