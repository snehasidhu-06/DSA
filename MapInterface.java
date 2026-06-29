import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class MapInterface {
    public static void main(String[] args) {
        // MAp - collection of key value pairs
        /*
         * A map cannot contain duplicate keys
         * Each key is associated with a single value
         */

        // Map implementation using HashMap

        Map<String, String> mapping = new HashMap<>(); // similar - Linked hashmap / TreeMap

        // Insertion
        mapping.put("in", "India");
        mapping.put("en", "England");
        mapping.put("us", "United States");

        System.out.println(mapping);

        Map<String, String> table = new HashMap<>();
        table.put("br", "brazil");

        System.out.println(table);
        table.putAll(mapping);
        System.out.println(table);

        // deletion
        table.remove("en");
        System.out.println(table);

        System.out.println(table.size());

        // table.clear();
        // System.out.println(table.size());

        table.putIfAbsent("is", "India3");
        System.out.println(table);

        System.out.println(table.get("br"));

        System.out.println(table.getOrDefault("usa", "none"));

        System.out.println(table.containsKey("in")); // return true or false

        System.out.println(table.containsValue("US"));

        table.replace("in", "indonesia");

        System.out.println(table);

        Set<String> keyset = table.keySet();
        System.out.println(keyset);

        Collection<String> valueSet = table.values();
        System.out.println(valueSet);

        // get all the entries from map - entry set

        Set<Map.Entry<String, String>> entryset = table.entrySet();
        System.out.println(entryset);

        // Iterating over a Map

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "two");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }

    }

}
