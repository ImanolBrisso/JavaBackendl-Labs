import java.util.Scanner;

public class PiramideAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la altura de la pirámide: ");
        int altura = scanner.nextInt();

        if (altura % 2 == 0) {
            System.out.println("La altura debe ser un número impar."); // tiene que ser impar el numero sino queda deformada la piramide
            return;
        }

        for (int i = 0; i < altura; i++) { // se le da la altura de la piramide
            for (int j = altura - i; j > 1; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.println(); // se hace este salto de linea porque sino quedan los asteriscos todo de seguido
        }
    }
}
