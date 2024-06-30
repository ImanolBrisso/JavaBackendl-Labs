public class ManipulacionArrays {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5}; // se podrían sumar valores sucesivamente

        // Se duplican los valores
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] * 2;
        }

        System.out.println("Array modificado:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
