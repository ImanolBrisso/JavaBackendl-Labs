public class NumerosPrimos {
    public static void main(String[] args) {

        System.out.println("Numeros primos hasta 100:");

        for (int i = 2; i <= 100; i++) { // Va desde el numero 2 hasta el 100 como rango numerico
            if (esPrimo(i)) {
                System.out.print(i + " "); // se imprime el valor
            }
        }
    }

    // Se verifica si el numero es primo - Si es el numero es "true" es Primo si es "false" no lo es
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false; // con el return se llama al valor para verificar lo anteriormente dicho
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
