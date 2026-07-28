//Q4. B)Given two non-negative integer values, print true if they have the same last digit, otherwise print false.

import java.util.Scanner;

class ass5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if ((num1 % 10) == (num2 % 10)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}
