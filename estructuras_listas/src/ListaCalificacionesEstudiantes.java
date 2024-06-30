import java.util.ArrayList;
import java.util.List;

// Se genera y define la clase de Estudiante
class Estudiante {
    private String nombre;
    private double calificacion;

    // Es el constructor
    public Estudiante(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    // Se ejecutan los Getters
    public String getNombre() {
        return nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }
}

public class ListaCalificacionesEstudiantes {
    public static void main(String[] args) {

        List<Estudiante> listaEstudiantes = new ArrayList<>();

        // Se agregan estudiantes
        listaEstudiantes.add(new Estudiante("Gianni", 86));
        listaEstudiantes.add(new Estudiante("Josefina", 90));
        listaEstudiantes.add(new Estudiante("Jaime", 77));
        listaEstudiantes.add(new Estudiante("Bob", 92));
        listaEstudiantes.add(new Estudiante("Santiago", 82));

        // Se genera el promedio entre todos los valores de calificacion
        double sumaCalificaciones = 0.0;
        for (Estudiante estudiante : listaEstudiantes) {
            sumaCalificaciones += estudiante.getCalificacion();
        }
        double promedio = sumaCalificaciones / listaEstudiantes.size();

        System.out.println("La calificación promedio de los estudiantes es: " + promedio);

        // Se hace la busqueda del estudiante con mayor calificacion - para luego imprimirla en la consola
        double maxCalificacion = Double.MIN_VALUE;
        String estudianteMaxCalificacion = "";
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getCalificacion() > maxCalificacion) {
                maxCalificacion = estudiante.getCalificacion();
                estudianteMaxCalificacion = estudiante.getNombre();
            }
        }

        System.out.println("El estudiante con la calificación más alta es: " + estudianteMaxCalificacion
                + " con una calificación de " + maxCalificacion);
    }
}