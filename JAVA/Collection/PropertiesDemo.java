//Write a program that will have a Properties class object capable of storing some States of India and their Capitals. Use an Iterator to list all the elements stored in the Properties.

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class PropertiesDemo {

    public static void main(String[] args) {

        // Create Properties object
        Properties states = new Properties();

        // Add State-Capital pairs
        states.setProperty("West Bengal", "Kolkata");
        states.setProperty("Maharashtra", "Mumbai");
        states.setProperty("Karnataka", "Bengaluru");
        states.setProperty("Tamil Nadu", "Chennai");
        states.setProperty("Gujarat", "Gandhinagar");
        states.setProperty("Rajasthan", "Jaipur");

        System.out.println("States and their Capitals:\n");

        // Create Iterator
        Iterator<Map.Entry<Object, Object>> iterator =
                states.entrySet().iterator();

        // Traverse the Properties object
        while (iterator.hasNext()) {

            Map.Entry<Object, Object> entry = iterator.next();

            System.out.println(
                    "State : " + entry.getKey()
                    + "  Capital : " + entry.getValue());
        }
    }
}
