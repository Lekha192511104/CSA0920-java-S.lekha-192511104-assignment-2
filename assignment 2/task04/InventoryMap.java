import java.util.*;

public class InventoryMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        hashMap.put(103, "Laptop");
        hashMap.put(101, "Keyboard");
        hashMap.put(102, "Mouse");

        treeMap.putAll(hashMap);
        linkedHashMap.put(103, "Laptop");
        linkedHashMap.put(101, "Keyboard");
        linkedHashMap.put(102, "Mouse");

        System.out.println("HashMap: " + hashMap);
        System.out.println("TreeMap: " + treeMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);

        System.out.println("Search code 102: " + hashMap.get(102));

        System.out.println("Sorted Inventory:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("Insertion Order:");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
