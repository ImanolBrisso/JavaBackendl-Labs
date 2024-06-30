import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListAvanzado {
    public static void main(String[] args) {

        LinkedList<String> lista = new LinkedList<>();

        // Se utiliza el First y Last entre los elementos agregados
        lista.addFirst("HTML");
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");
        lista.addLast("CSS");

        System.out.println("LinkedList: " + lista);

        // Se conviere LinkedList a ArrayList
        ArrayList<String> arrayList = new ArrayList<>(lista);
        System.out.println("ArrayList: " + arrayList);

        // Se añade "Kotlin" luego de "Java"
        arrayList.add(2, "Kotlin");
        System.out.println("Modified ArrayList: " + arrayList);

        // Se hace la conversion de Arraylist a LinkedList a diferencia de la anterior vez
        LinkedList<String> nuevaLista = new LinkedList<>(arrayList);
        System.out.println("New LinkedList from ArrayList: " + nuevaLista);
    }
}
