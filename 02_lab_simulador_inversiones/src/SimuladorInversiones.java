import java.util.Scanner;

public class SimuladorInversiones {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Principio (donde se interactuara)
        System.out.println("Ingrese el estado actual del mercado (recesión, estable, crecimiento):");
        String estado = scanner.nextLine().toLowerCase();

        // Perfil a elegir por el usuario
        System.out.println("Ingrese su perfil de riesgo personal (bajo, medio, alto):");
        String riesgo = scanner.nextLine().toLowerCase();

        // Recomendacion de Inversion que se le devolvera con el return
        String recomendacion = recomendarInversion(estado, riesgo); // se utiliza "estado, riesgo" debido al string anterior mencionado

        // Se le recomienda al usuario la mejor manera de "inversion"
        System.out.println("Recomendación de inversión: " + recomendacion);

        scanner.close();
    }
    public static String recomendarInversion(String estado, String riesgo) { //verificar los strings utilizados anteriormente para que sean los mismos
        String recomendacion = ""; // se utiliza dobles comillas?

        if (estado.equals("recesión")) { // para recesión al ejecutarse debe usarse con tilde sino no lo ejecuta correctamente
            if (riesgo.equals("bajo")) {
                recomendacion = "Bonos";
            } else if (riesgo.equals("medio")) {
                recomendacion = "Bienes raíces";
            } else if (riesgo.equals("alto")) {
                recomendacion = "Acciones de empresas sólidas";
            } else {
                recomendacion = "Perfil de riesgo no válido";
            }
        } else if (estado.equals("estable")) {
            if (riesgo.equals("bajo")) {
                recomendacion = "Cuentas de ahorro";
            } else if (riesgo.equals("medio")) {
                recomendacion = "Bienes raíces";
            } else if (riesgo.equals("alto")) {
                recomendacion = "Acciones de empresas con potencial de crecimiento";
            } else {
                recomendacion = "Perfil de riesgo no válido";
            }
        } else if (estado.equals("crecimiento")) {
            if (riesgo.equals("bajo")) {
                recomendacion = "Bonos gubernamentales";
            } else if (riesgo.equals("medio")) {
                recomendacion = "Acciones diversificadas";
            } else if (riesgo.equals("alto")) {
                recomendacion = "Acciones de empresas de tecnología";
            } else {
                recomendacion = "Perfil de riesgo no válido";
            }
        } else {
            recomendacion = "Ingrese un estado efectivo";
        }

        return recomendacion; // se le recomienda la inversion o tipo de inversion segun los datos que ingreso el usuario
    }
}
