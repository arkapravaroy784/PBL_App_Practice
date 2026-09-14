import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        // Create TreeSet
        TreeSet<String> countries = new TreeSet<>();

        // Add elements
        countries.add("India");
        countries.add("Germany");
        countries.add("Japan");
        countries.add("Australia");
        countries.add("Canada");
        countries.add("France");

        // a) Reverse the elements
        System.out.println("TreeSet in Reverse Order:");

        Iterator<String> reverseIterator = countries.descendingIterator();

        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

        // b) Iterate using Iterator
        System.out.println("\nTreeSet using Iterator:");

        Iterator<String> iterator = countries.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // c) Check if an element exists
        String search = "Japan";

        if (countries.contains(search)) {
            System.out.println("\n" + search + " exists in the TreeSet.");
        } else {
            System.out.println("\n" + search + " does not exist in the TreeSet.");
        }
    }
}