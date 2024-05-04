public class Fibonacci {
    public static void main(String[] args) {

        int n = 10; // colocar la "n" en el print de abajo, el 10 refiere a la cantidad de numeros de fibonacci

        int primero = 0;
        int segundo = 1;

        System.out.println("Secuencia de Fibonacci para los primeros " + n + " terminos:");

        System.out.print(primero + " "); //primer termino
        System.out.print(segundo + " "); //segundo termino

        for (int i = 2; i < n; i++) {
            int siguiente = primero + segundo; // se deben actualizar los terminos para que sea consecuente
            System.out.print(siguiente + " ");

            primero = segundo; // se actualiza en esta 2 ultimas lineas
            segundo = siguiente;
        }
    }
}
