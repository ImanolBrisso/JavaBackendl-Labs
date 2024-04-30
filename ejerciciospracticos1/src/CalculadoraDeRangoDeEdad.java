import java.util.Scanner;

public class CalculadoraDeRangoDeEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();

        String clasificacion = clasificacionEdad(edad);

        System.out.println("Perteneeces a la clasificacion: " + clasificacion);

        scanner.close();
    }

    public static String clasificacionEdad(int edad) {
        if (edad < 0) {
            return "Por favor ingrese una edad real";
        } else if (edad < 13) {
            return "Infante/Niñez";
        } else if (edad < 18) {
            return "Adolescencia";
        } else if (edad < 60) {
            return "Adultez";
        } else {
            return "Vejez";
        }
    }
}
