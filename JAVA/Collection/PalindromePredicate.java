import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PalindromePredicate {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "madam",
                "java",
                "level",
                "python",
                "radar",
                "apple",
                "malayalam",
                "computer",
                "refer",
                "hello"));

        System.out.println("Original List:");

        System.out.println(words);

        // Predicate to check palindrome
        Predicate<String> isPalindrome = word -> {

            String reverse = new StringBuilder(word).reverse().toString();

            return word.equalsIgnoreCase(reverse);

        };

        System.out.println("\nPalindrome Words:");

        for (String word : words) {

            if (isPalindrome.test(word)) {

                System.out.println(word);

            }

        }

    }

}