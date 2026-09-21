public class MyClassWithLambda {

    public static void main(String[] args) {

        // Lambda Expression
        WordCount wc = (str) -> {

            if (str == null || str.trim().isEmpty()) {
                return 0;
            }

            String[] words = str.trim().split("\\s+");

            return words.length;

        };

        String sentence = "Java is a powerful programming language";

        System.out.println("Sentence : " + sentence);

        System.out.println("Number of Words : "
                + wc.count(sentence));

    }

}