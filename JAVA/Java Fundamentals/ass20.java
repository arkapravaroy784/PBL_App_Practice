//Write a Java program to reverse a given number and print the reversed number.

import java.util.Scanner;

class ass20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed Number = " + reverse);

        sc.close();
    }
}
