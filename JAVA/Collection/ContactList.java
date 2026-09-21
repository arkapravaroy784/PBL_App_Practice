//Create a Collection ContactList using HashMap to store the name and phone number of contacts added. The program should use appropriate generics (String, Integer) and have the
//following abilities:
//a) Check if a particular key exists or not.
//b) Check if a particular value exists or not.
//c) Use an Iterator to loop through the map.


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList {

    public static void main(String[] args) {

        // Create HashMap
        HashMap<String, Integer> contacts = new HashMap<>();

        // Add Contacts
        contacts.put("Arka", 987654321);
        contacts.put("Sayan", 912345678);
        contacts.put("Indranil", 998877665);
        contacts.put("Sabuj", 987123456);
        contacts.put("Aniket", 901234567);

        // Check if a key exists
        String name = "Rahul";

        if (contacts.containsKey(name)) {
            System.out.println(name + " exists in the Contact List.");
        } else {
            System.out.println(name + " does not exist in the Contact List.");
        }

        // Check if a value exists
        int phone = 998877665;

        if (contacts.containsValue(phone)) {
            System.out.println(phone + " exists in the Contact List.");
        } else {
            System.out.println(phone + " does not exist in the Contact List.");
        }

        // Iterate using Iterator
        System.out.println("\nContact List:");

        Iterator<Map.Entry<String, Integer>> iterator =
                contacts.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, Integer> entry = iterator.next();

            System.out.println("Name : " + entry.getKey()
                    + "    Phone : " + entry.getValue());
        }
    }
}
