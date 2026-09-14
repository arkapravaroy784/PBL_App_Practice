import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class SumUsingFunction {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                10, 20, 30, 40, 50,
                60, 70, 80, 90, 100));

        System.out.println("Numbers:");

        System.out.println(numbers);

        // Function to calculate sum
        Function<ArrayList<Integer>, Integer> sumFunction = list -> {

            int sum = 0;

            for (int num : list) {

                sum += num;

            }

            return sum;

        };

        // Calculate Sum
        int sum = sumFunction.apply(numbers);

        System.out.println("\nSum = " + sum);

    }

}