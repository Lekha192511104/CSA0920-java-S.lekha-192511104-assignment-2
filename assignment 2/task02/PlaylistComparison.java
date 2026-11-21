import java.util.*;

public class PlaylistComparison {
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 50000};

        for (int size : sizes) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            LinkedList<Integer> linkedList = new LinkedList<>();
            ArrayDeque<Integer> deque = new ArrayDeque<>();

            for (int i = 0; i < size; i++) {
                arrayList.add(i);
                linkedList.add(i);
                deque.addLast(i);
            }

            long start, end;

            start = System.nanoTime();
            arrayList.add(0, -1);
            end = System.nanoTime();
            System.out.println("ArrayList front insert: " + (end - start) + " ns");

            start = System.nanoTime();
            linkedList.add(0, -1);
            end = System.nanoTime();
            System.out.println("LinkedList front insert: " + (end - start) + " ns");

            start = System.nanoTime();
            deque.addFirst(-1);
            end = System.nanoTime();
            System.out.println("ArrayDeque front insert: " + (end - start) + " ns");

            start = System.nanoTime();
            int value = arrayList.get(size / 2);
            end = System.nanoTime();
            System.out.println("ArrayList middle access: " + (end - start) + " ns");

            start = System.nanoTime();
            value = linkedList.get(size / 2);
            end = System.nanoTime();
            System.out.println("LinkedList middle access: " + (end - start) + " ns");

            System.out.println();
        }
    }
}
