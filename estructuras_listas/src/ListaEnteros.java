import java.util.ArrayList;
import java.util.List;

public class ListaEnteros {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        for (int i = 1; i <= 5; i++) { // se define del 1 al 5
            lista.add(i);
        }

        System.out.println("Lista: " + lista);
    }
}
