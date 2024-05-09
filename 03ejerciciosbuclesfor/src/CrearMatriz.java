public class CrearMatriz {
    public static void main(String[] args) {

        int[][] matriz = new int[6][6]; // la matriz se hizo de 6*6

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i * j; // valores
            }
        }

        System.out.println("Matriz de 6x6:");
        for (int i = 0; i < matriz.length; i++) {

            System.out.print("Ejemplo " + i + ": ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
