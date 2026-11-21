import java.util.*;

class Patient {
    String name;
    int severity;
    long arrival;

    Patient(String name, int severity, long arrival) {
        this.name = name;
        this.severity = severity;
        this.arrival = arrival;
    }

    public String toString() {
        return name + " (Severity " + severity + ")";
    }
}

public class HospitalTriage {
    public static void main(String[] args) {
        PriorityQueue<Patient> queue = new PriorityQueue<>(
            Comparator.comparingInt((Patient p) -> p.severity)
            .thenComparingLong(p -> p.arrival)
        );

        queue.add(new Patient("Arun", 3, 1));
        queue.add(new Patient("Bala", 1, 2));
        queue.add(new Patient("Charan", 2, 3));
        queue.add(new Patient("Divya", 1, 4));
        queue.add(new Patient("Ezhil", 5, 5));

        System.out.println("Treatment Order:");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
