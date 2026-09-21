//Create an ArrayList a1 and add 10 different words. Write a program to print all the strings in reverse order using a lambda expression.

import java.util.ArrayList;

public class ReverseStringLambda {

    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<>();

        // Add 10 different words
        a1.add("Java");
        a1.add("Python");
        a1.add("C");
        a1.add("C++");
        a1.add("JavaScript");
        a1.add("SQL");
        a1.add("HTML");
        a1.add("CSS");
        a1.add("React");
        a1.add("Spring");

        System.out.println("Original ArrayList:");

        System.out.println(a1);

        System.out.println("\nStrings in Reverse Order:");

        // Lambda Expression
        a1.stream()
          .sorted((s1, s2) -> s2.compareTo(s1))
          .forEach(word -> System.out.println(word));

    }

}
