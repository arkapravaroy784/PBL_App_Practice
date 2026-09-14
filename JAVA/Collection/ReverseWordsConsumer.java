import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class ReverseWordsConsumer {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "Java",
                "Python",
                "Apple",
                "Computer",
                "Keyboard",
                "Monitor",
                "Laptop",
                "Internet",
                "Database",
                "Programming"));

        System.out.println("Original ArrayList:");

        System.out.println(words);

        // Consumer to reverse each word
        Consumer<ArrayList<String>> reverseWords = list -> {

            for (int i = 0; i < list.size(); i++) {

                String reversed = new StringBuilder(list.get(i))
                        .reverse()
                        .toString();

                list.set(i, reversed);

            }

        };

        // Apply Consumer
        reverseWords.accept(words);

        System.out.println("\nUpdated ArrayList:");

        System.out.println(words);

    }

}