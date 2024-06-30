import java.util.Arrays;

public class OrdenandounArray {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 8, 1, 3};

        Arrays.sort(numeros);

        // Elemento especifico del indice = 3
        int elementoBuscado = 3;
        int indice = -1;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == elementoBuscado) {
                indice = i;
                break;
            }
        }

        System.out.print("Sorted array: "); // Array ordenado
        System.out.println(Arrays.toString(numeros));

        // Se da el elemento buscado especifico en la siguiente impresion
        System.out.println("Element " + elementoBuscado + " is at index: " + indice);
    }
}
