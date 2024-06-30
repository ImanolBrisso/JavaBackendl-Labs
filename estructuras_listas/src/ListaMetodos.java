import java.util.ArrayList;
import java.util.List;

public class ListaMetodos {
    public static void main(String[] args) {

        List<String> listaCadenas = new ArrayList<>();


        listaCadenas.add("Manzana");
        listaCadenas.add("Banana");
        listaCadenas.add("Cereza");

        // Se genera la busqueda del valor especifico
        String elementoBuscado = "Banana";
        if (listaCadenas.contains(elementoBuscado)) {
            System.out.println("La lista contiene '" + elementoBuscado + "'");
        } else {
            System.out.println("La lista NO contiene '" + elementoBuscado + "'");
        }

        // Se elimina uno de los valores especificos - a elegir
        String elementoAEliminar = "Banana";
        if (listaCadenas.contains(elementoAEliminar)) {
            listaCadenas.remove(elementoAEliminar);
            System.out.println("'" + elementoAEliminar + "' fue eliminado de la lista");
        } else {
            System.out.println("No se encontró '" + elementoAEliminar + "' en la lista");
        }


        System.out.println("Lista actualizada: " + listaCadenas);
    }
}
