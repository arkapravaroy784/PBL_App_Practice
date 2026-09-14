import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FileWordCount {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java FileWordCount <inputFile> <outputFile>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        TreeMap<String, Integer> wordCount = new TreeMap<>();

        try {

            Scanner fileScanner = new Scanner(new File(inputFile));

            while (fileScanner.hasNext()) {

                String word = fileScanner.next();

                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }

            fileScanner.close();

            FileWriter writer = new FileWriter(outputFile);

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                writer.write(entry.getKey() + " : " + entry.getValue() + "\n");
            }

            writer.close();

            System.out.println("Word count written to " + outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}