public class ArraysNumEnteros {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        // Se marca el margen del 1 al 10 en cuanto a numeros a tener en cuenta
        for (int i = 0; i < 10; i++) {
            numeros[i] = i + 1;
        }

        // Se imprimen los numeros anteriores del 1 al 10 por cada elemento a tener en cuenta
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
