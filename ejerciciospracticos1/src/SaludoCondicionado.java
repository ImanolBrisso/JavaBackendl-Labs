import java.util.Scanner;

public class SaludoCondicionado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la hora actual:"); // verificar el rango horario para prueba de ejecucion, detallar mensaje
        int hora = scanner.nextInt();

        if (hora >= 0 && hora < 7) { // consultar como agregar los minutos para tener en cuenta
            System.out.println("Buenas Noches");
        } else if (hora >= 7 && hora < 13) {
            System.out.println("Buenos dias");
        } else if (hora >= 13 && hora < 19) {
            System.out.println("Buenas Tardes");
        } else if (hora >= 19 && hora < 24) { //  ¿se coloca el 0 o 24?
            System.out.println("Buenas noches");
        } else {
            System.out.println("Por favor, ingrese una hora entre las 0 y 24.");
        }

        scanner.close();
    }
}
