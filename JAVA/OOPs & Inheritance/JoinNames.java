import java.util.ArrayList;
import java.util.StringJoiner;

class JoinNames {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Add names
        names.add("Arka");
        names.add("Saysn");
        names.add("Sabuj");
        names.add("Indranil");

        // Create StringJoiner
        StringJoiner sj = new StringJoiner(", ", "{", "}");

        // Add names to StringJoiner
        for (String name : names) {
            sj.add(name);
        }

        // Print result
        System.out.println(sj);
    }
}