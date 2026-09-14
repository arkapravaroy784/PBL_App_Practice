import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class OddEvenConsumer {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                10, 15, 22, 31, 44,
                57, 68, 79, 80, 95));

        System.out.println("Numbers:");

        System.out.println(numbers);

        // Consumer to display Odd or Even
        Consumer<Integer> oddEven = number -> {

            if (number % 2 == 0) {

                System.out.println(number + " even");

            } else {

                System.out.println(number + " odd");

            }

        };

        System.out.println("\nOdd / Even Result:");

        // Apply Consumer to each element
        numbers.forEach(oddEven);

    }

}