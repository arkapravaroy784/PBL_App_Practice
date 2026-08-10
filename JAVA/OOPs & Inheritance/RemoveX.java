//Given a string, if the first or last character is 'x', return the string without those 'x' characters. Otherwise, return the string unchanged.

import java.util.Scanner;

class RemoveX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.startsWith("x")) {
            str = str.substring(1);
        }

        if (str.endsWith("x")) {
            str = str.substring(0, str.length() - 1);
        }

        System.out.println(str);

        sc.close();
    }
}
