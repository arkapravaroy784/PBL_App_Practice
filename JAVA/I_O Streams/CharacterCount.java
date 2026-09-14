//Write a program to count the number of times a character appears in a file.
//Note:
// The character check is case-insensitive.
// 'a' and 'A' are considered the same.

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();

        System.out.print("Enter the character to be counted: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        int count = 0;

        try 
            FileReader fr = new FileReader(fileName);

            int data;

            while ((data = fr.read()) != -1) {

                char currentChar = Character.toLowerCase((char) data);

                if (currentChar == ch) {
                    count++;
                }
            }

            fr.close();

            System.out.println("File '" + fileName + "' has " + count
                    + " instances of letter '" + ch + "'.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
