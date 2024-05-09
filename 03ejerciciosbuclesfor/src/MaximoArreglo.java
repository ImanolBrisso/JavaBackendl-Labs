public class MaximoArreglo {
    public static void main(String[] args) {

        int[] arreglo = {23, 17, 43, 78, 9, 32, 64, 44, 87, 95, 98};

        int maximo = arreglo[0]; // maximo arreglo desde 0

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }

        System.out.println("El valor máximo en el arreglo es: " + maximo);
    }
}
