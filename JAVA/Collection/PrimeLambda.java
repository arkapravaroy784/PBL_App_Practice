import java.util.ArrayList;
import java.util.Random;

public class PrimeLambda {

    // Method to check Prime Number
    public static boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>();

        Random random = new Random();

        // Add 25 random numbers (1 to 100)
        for (int i = 0; i < 25; i++) {

            a1.add(random.nextInt(100) + 1);

        }

        System.out.println("ArrayList:");

        System.out.println(a1);

        System.out.println("\nPrime Numbers:");

        // Lambda Expression
        a1.forEach(number -> {

            if (isPrime(number)) {
                System.out.print(number + " ");
            }

        });

    }

}