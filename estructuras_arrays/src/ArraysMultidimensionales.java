public class ArraysMultidimensionales {
    public static void main(String[] args) {
        // Se crea la matriz del 3 x 3
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Suma de elementos diagonal
        int sumaDiagonal = 0;
        for (int i = 0; i < 3; i++) {
            sumaDiagonal += matriz[i][i];
        }

        System.out.println("La suma de los elementos de la diagonal es: " + sumaDiagonal);
    }
}
