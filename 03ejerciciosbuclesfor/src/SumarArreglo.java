public class SumarArreglo {
    public static void main(String[] args) {


        int[] arreglo = {10, 20, 30, 40, 50}; // valores para el 150 de valor final

        int sumar = 0;

        for (int i = 0; i < arreglo.length; i++) { // se suman los elementos
            sumar += arreglo[i];
        }

        System.out.println("La suma de los elementos del arreglo es: " + sumar);
    }
}
