//Write a Java program to:
//1. Filter the negative even numbers from an ArrayList.
//2. Store them into a new ArrayList.
//3. Print the new ArrayList elements. 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NegativeEvenFilter {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(
                12, -4, 7, -9, -10, 15, 20, -18, 5, -25,
                -30, 44, -8, 17, -2, 31, -40, 50, -16, 9));

        System.out.println("Original ArrayList:");
        System.out.println(list);

        // Filter negative even numbers
        List<Integer> newList = list.stream()
                .filter(num -> num < 0 && num % 2 == 0)
                .collect(Collectors.toList());

        // Print new ArrayList
        System.out.println("\nNegative Even Numbers:");
        System.out.println(newList);

    }

}
