import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaTiempos {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Se agregan los elementos al arraylist y linkedlist al mismo tiempo
        int numElements = 1000000;  //se ingresa un numero alto para medirlo correctamente
        for (int i = 0; i < numElements; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long startTime = System.nanoTime();
        int elementoArrayList = arrayList.get(numElements / 2); // es necesario colocar dicha linea para la diferencia en la consola
        long endTime = System.nanoTime();
        long tiempoArrayList = endTime - startTime;


        startTime = System.nanoTime();
        int elementoLinkedList = linkedList.get(numElements / 2);
        endTime = System.nanoTime();
        long tiempoLinkedList = endTime - startTime;

        System.out.println("Tiempo de acceso en ArrayList: " + tiempoArrayList + " nanosegundos"); // ns = nanosegundos
        System.out.println("Tiempo de acceso en LinkedList: " + tiempoLinkedList + " nanosegundos"); // ns = nanosegundos
    }
}
