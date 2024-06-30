import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ComparacionArrayYLinked {
    public static void main(String[] args) {
        // Se cream ambas Lists
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Nuevamente se agregan los elementos a las mismas Listas (ArrayList y LinkedList)
        int numElements = 100000;  // 100 mil elementos para observación
        for (int i = 0; i < numElements; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long startTime = System.nanoTime(); // = nanoseconds = ns
        arrayList.add(numElements / 2, 12345);
        long endTime = System.nanoTime();
        long tiempoInsercionArrayList = endTime - startTime;

        startTime = System.nanoTime();
        linkedList.add(numElements / 2, 12345);
        endTime = System.nanoTime();
        long tiempoInsercionLinkedList = endTime - startTime;

        // se ejecuta la eliminacion de un elemento
        startTime = System.nanoTime();
        arrayList.remove(numElements / 2);
        endTime = System.nanoTime();
        long tiempoEliminacionArrayList = endTime - startTime;

        // se mide el tiempo de la eliminacion de dicho elemento
        startTime = System.nanoTime();
        linkedList.remove(numElements / 2);
        endTime = System.nanoTime();
        long tiempoEliminacionLinkedList = endTime - startTime;

        System.out.println("Tiempo de inserción en ArrayList: " + tiempoInsercionArrayList + " nanosegundos");
        System.out.println("Tiempo de inserción en LinkedList: " + tiempoInsercionLinkedList + " nanosegundos");
        System.out.println("Tiempo de eliminación en ArrayList: " + tiempoEliminacionArrayList + " nanosegundos");
        System.out.println("Tiempo de eliminación en LinkedList: " + tiempoEliminacionLinkedList + " nanosegundos");
    }
}
