//Write a Java program that reads an integer number (between 1 and 255) from the user andprints the binary representation of the number as an 8-bit string. 
//If the binary string has fewer than 8 digits, pad it with leading zeros.

import java.util.Scanner;

public class BinaryRepresentation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-255): ");
        int number = sc.nextInt();

        String binary = Integer.toBinaryString(number);

        binary = String.format("%8s", binary).replace(' ', '0');

        System.out.println("Binary Representation: " + binary);

        sc.close();
    }
}
