public class SumarDiagonal {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}  // se hace con numeros correspondientes para que de 65 en este caso - probar mas abajo
                                      // de 5 x 5
        };

        int sumaDiagonal = 0;


        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonal += matriz[i][i];
        }

        System.out.println("La suma de los elementos de la diagonal principal es: " + sumaDiagonal);
    }
}
