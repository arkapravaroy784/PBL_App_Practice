//Write a Java program that accepts a string and returns a new string without the first and last character of the input string.
import java.util.Scanner;

class RemoveFirstLast {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println(str.substring(1, str.length() - 1));

        sc.close();
    }
}
