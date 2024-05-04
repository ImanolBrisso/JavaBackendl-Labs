import java.util.Scanner;

public class ContarLetras {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena: "); // dar el ejemplo de "hola mundo"
        String cadena = scanner.nextLine();

        System.out.print("Ingresa una letra: "); //en caso de que no la use colocar mas abajo algun tipo de error detallado
        char letra = scanner.next().charAt(0);

        int contador = 0; // contador desde 0, verificar de usar el for abajo

        for (int i = 0; i < cadena.length(); i++) { //se usa el bucle for para recorrer la cadena y busque cuantas veces aparece la letra
            if (cadena.charAt(i) == letra) {
                contador++;


                if (cadena.length() > 0) {
                    System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la cadena.");
                    // cantidad de veces que aparece la letra en la cadena
                }
            } else {
                    System.out.println("Error: La cadena que ingreso no es valida, verifiquela nuevamente. ");
                    // verificar la replica del mensaje error

                }

                scanner.close();
            }
        }
    }


