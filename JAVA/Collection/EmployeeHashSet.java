//Write a program to store a group of employee names into a HashSet and retrieve the elements one by one using an Iterator.

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {

    public static void main(String[] args) {

        // Create a HashSet to store employee names
        HashSet<String> employees = new HashSet<>();

        // Add employee names
        employees.add("Arka");
        employees.add("Sayan");
        employees.add("Indranil");
        employees.add("Sabuj");
        employees.add("Aniket");
        employees.add("Rohan");

        System.out.println("Employee Names:");

        // Create an Iterator
        Iterator<String> iterator = employees.iterator();

        // Retrieve elements one by one
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
