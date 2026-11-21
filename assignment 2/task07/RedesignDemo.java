import java.util.*;

public class RedesignDemo {
    public static void main(String[] args) {
        StringBuilder ticket = new StringBuilder();
        ticket.append("PNR:12345");
        ticket.append(" | Name:Arun");
        ticket.append(" | Coach:S1");

        ArrayDeque<String> upNext = new ArrayDeque<>();
        upNext.addLast("Song A");
        upNext.addLast("Song B");
        upNext.addFirst("Priority Song");

        HashMap<Integer, String> inventory = new HashMap<>();
        inventory.put(101, "Keyboard");
        inventory.put(102, "Mouse");

        System.out.println("Ticket: " + ticket);
        System.out.println("Next Song: " + upNext.removeFirst());
        System.out.println("Inventory Item: " + inventory.get(101));
    }
}
