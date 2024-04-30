import java.util.Scanner;

public class ClasificadorDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        double numero = scanner.nextDouble(); //en este caso no se puede utilizar numeros con , como en el comprobadordepase

        if (numero > 0) {
            System.out.println("El número que ingreso es positivo.");
        } else if (numero < 0) {
            System.out.println("El número que ingreso es negativo.");
        }
        scanner.close();
    }
}
