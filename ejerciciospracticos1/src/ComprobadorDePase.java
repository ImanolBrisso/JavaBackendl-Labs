import java.util.Scanner;

public class ComprobadorDePase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su calificacion");
        double calificacion = scanner.nextDouble(); //se puede poner de ejemplo 6.5 al ejecutar programa de prueba

        if (calificacion >= 0 && calificacion <= 12) { //rango entre 0 y 12
            if (calificacion >= 6) {
                System.out.println("¡Felicitaciones, aprobaste!");
            } else {
                System.out.println("Reprobaste");
            }
        } else {
            System.out.println("Por favor ingrese una calificacion entre 0 y 12"); //mensaje de error, no valido
        }
        scanner.close();
    }
}
