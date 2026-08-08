//Given a string, return a new string made of 'n' copies of the first 2 characters of the original string, where 'n' is the length of the string.
import java.util.Scanner;

class StringCopies {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String firstTwo = str.substring(0, 2);

        for (int i = 0; i < str.length(); i++) {
            System.out.print(firstTwo);
        }

        sc.close();
    }
}
