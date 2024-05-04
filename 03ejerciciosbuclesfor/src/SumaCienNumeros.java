public class SumaCienNumeros {
    public static void main(String[] args) {

        int suma = 0; // se inicializa

        for (int i = 1; i <= 100; i++) {
            suma += i; // variable "i" sumado la variable "suma"
        }

        System.out.println("La suma de los primeros 100 números naturales es: " + suma); //Tiene que dar 5050 = lo esperado
        // 5050 es la suma total de los 100 numeros naturales
    }
}
