//Write a Java program that returns the first half of the string, if the length of the string is even. It should return "null" for an odd-length string.

import java.util.Scanner;

class FirstHalfString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.length() % 2 == 0) {
            System.out.println(str.substring(0, str.length() / 2));
        } else {
            System.out.println("null");
        }

        sc.close();
    }
}
