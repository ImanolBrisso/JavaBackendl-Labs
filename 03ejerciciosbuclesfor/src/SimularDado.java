import java.util.Random;

public class SimularDado {
    public static void main(String[] args) {

        Random random = new Random(); // aleatorio el numero

        int[] frecuencia = new int[6]; // caras del dado

        for (int i = 0; i < 100; i++) {

            int resultado = random.nextInt(6) + 1; // entre 6

            frecuencia[resultado - 1]++; // aumenta la cantidad de veces
        }

        System.out.println("Resultados de lanzar un dado 100 veces: ");

        for (int cara = 0; cara < 6; cara++) {

            System.out.println("Cara " + (cara + 1) + ": " + frecuencia[cara] + " veces");
        }
    }
}