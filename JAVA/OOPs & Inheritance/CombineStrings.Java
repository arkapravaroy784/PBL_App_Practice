//Given two strings, a and b, print a new string by combining them as follows:
//•	First character of a 
//•	First character of b 
//•	Second character of a 
//•	Second character of b 
//•	and so on... 
//If one string is longer than the other, append the remaining characters at the end of the result.

import java.util.Scanner;

class CombineStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        String result = "";

        int minLength = Math.min(a.length(), b.length());

        // Combine characters alternately
        for (int i = 0; i < minLength; i++) {
            result = result + a.charAt(i) + b.charAt(i);
        }

        // Append remaining characters
        if (a.length() > b.length()) {
            result = result + a.substring(minLength);
        } else if (b.length() > a.length()) {
            result = result + b.substring(minLength);
        }

        System.out.println(result);

        sc.close();
    }
}
