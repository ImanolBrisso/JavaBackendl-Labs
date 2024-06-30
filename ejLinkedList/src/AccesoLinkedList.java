import java.util.LinkedList;

public class AccesoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> listaEnlazada = new LinkedList<>();

        // Se agregan los mismos elementos que en la anterior clase de "CadenaBas.."
        listaEnlazada.add("Java");
        listaEnlazada.add("Python");
        listaEnlazada.add("C++");
        listaEnlazada.add("JavaScript");

        String primerElemento = listaEnlazada.getFirst();
        System.out.println("First element: " + primerElemento);

        String ultimoElemento = listaEnlazada.getLast();
        System.out.println("Last element: " + ultimoElemento);
    }
}
