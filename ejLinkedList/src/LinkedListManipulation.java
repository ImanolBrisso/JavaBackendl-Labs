import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListManipulation {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();

        // Se generan elementos, dando un inicio de agregado y un final a su vez
        lista.addFirst("HTML");
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");
        lista.addLast("CSS");

        // se hace lista.remove de ser necesario

        // Iterar usando Iterator - se indica en la consola
        System.out.println("Iterando usando Iterator:");
        Iterator<String> iterador = lista.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        // Iterar usando bucle for-each - se indica en la consola
        System.out.println("\nIterando usando bucle for-each:"); // se genera a su vez un salto de linea
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}
