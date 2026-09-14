//Create an ArrayList that can store only String objects. Create a printAll() method that prints all the elements of the ArrayList using an Iterator.

import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayList {

    // Method to print all elements using Iterator
    public static void printAll(ArrayList<String> list) {

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Adding Strings
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("C++");
        list.add("JavaScript");
        list.add("SQL");

        System.out.println("Elements of the ArrayList:");

        printAll(list);

    }
}
