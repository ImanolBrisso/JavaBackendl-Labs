import java.util.LinkedList;

public class CadenaBasicaLinkedList {
    public static void main(String[] args) {
        LinkedList<String> listaEnlazada = new LinkedList<>();

        // Se agregan los elementos
        listaEnlazada.add("Java");
        listaEnlazada.add("Python");
        listaEnlazada.add("C++");
        listaEnlazada.add("JavaScript");

        System.out.print("LinkedList: [");
        for (int i = 0; i < listaEnlazada.size(); i++) {
            System.out.print(listaEnlazada.get(i));
            if (i < listaEnlazada.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
