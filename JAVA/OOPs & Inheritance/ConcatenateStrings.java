//Write a Java program to concatenate two strings and return the result in lowercase.
//Note: If the concatenation creates a double character (the last character of the first string is the same as the first character of the second string), then one of the duplicate characters should be omitted.

import java.util.Scanner;

class ConcatenateStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        String result;

        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            result = str1 + str2.substring(1);
        } else {
            result = str1 + str2;
        }

        System.out.println(result.toLowerCase());

        sc.close();
    }
}
