import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PerfectSquareFilter {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                4, 7, 9, 15, 16,
                20, 25, 30, 36, 50));

        System.out.println("Original List:");

        System.out.println(numbers);

        // Predicate to check Perfect Square
        Predicate<Integer> isPerfectSquare = number -> {

            int root = (int) Math.sqrt(number);

            return root * root == number;

        };

        System.out.println("\nPerfect Square Numbers:");

        for (int number : numbers) {

            if (isPerfectSquare.test(number)) {

                System.out.println(number);

            }

        }

    }

}