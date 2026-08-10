//Given two strings, a and b, return a new string of the form: short + long + short
//where the shorter string is placed on the outside and the longer string is placed in the middle.
//Note:
//•	The two strings will not be of the same length. 
//•	The strings may be empty (length = 0).

import java.util.Scanner;

class ShortLongShort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        if (a.length() < b.length()) {
            System.out.println(a + b + a);
        } else {
            System.out.println(b + a + b);
        }

        sc.close();
    }
}
