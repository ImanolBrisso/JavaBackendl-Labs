import java.util.Scanner;

public class VerificacionDeEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad para poder ingresar al evento:");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad, estas apto para poder ingresar.");
        } else {
            System.out.println("Eres menor de edad, no estas apto para poder ingresar.");
        }
        scanner.close();
    }
}
