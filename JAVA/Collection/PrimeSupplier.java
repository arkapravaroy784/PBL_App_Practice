import java.util.ArrayList;
import java.util.function.Supplier;

public class PrimeSupplier {

    // Method to check Prime
    public static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0) {
                return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {

        // Supplier to generate first 10 prime numbers
        Supplier<ArrayList<Integer>> primeSupplier = () -> {

            ArrayList<Integer> primes = new ArrayList<>();

            int number = 2;

            while (primes.size() < 10) {

                if (isPrime(number)) {

                    primes.add(number);

                }

                number++;

            }

            return primes;

        };

        // Get the ArrayList
        ArrayList<Integer> primeList = primeSupplier.get();

        System.out.println("First 10 Prime Numbers:");

        System.out.println(primeList);

    }

}