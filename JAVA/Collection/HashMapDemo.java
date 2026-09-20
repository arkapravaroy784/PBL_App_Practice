//Create a HashMap capable of storing String objects. The program should have the following abilities:
//a) Check if a particular key exists or not.
//b) Check if a particular value exists or not.
//c) Use an Iterator to loop through the map.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        // Create HashMap
        HashMap<String, String> countries = new HashMap<>();

        // Add Key-Value pairs
        countries.put("India", "Delhi");
        countries.put("Japan", "Tokyo");
        countries.put("Germany", "Berlin");
        countries.put("France", "Paris");
        countries.put("Canada", "Ottawa");

        // Check if a key exists
        String key = "India";

        if (countries.containsKey(key)) {
            System.out.println(key + " exists as a key.");
        } else {
            System.out.println(key + " does not exist as a key.");
        }

        // Check if a value exists
        String value = "Tokyo";

        if (countries.containsValue(value)) {
            System.out.println(value + " exists as a value.");
        } else {
            System.out.println(value + " does not exist as a value.");
        }

        // Iterate using Iterator
        System.out.println("\nHashMap Elements:");

        Iterator<Map.Entry<String, String>> iterator =
                countries.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, String> entry = iterator.next();

            System.out.println(
                    "Country : " + entry.getKey()
                    + "  Capital : " + entry.getValue());
        }
    }
}
