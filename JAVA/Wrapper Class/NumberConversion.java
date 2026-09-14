//Write a Java program to receive an integer number as a command line argument, and print the binary, octal, and hexadecimal equivalent of the given number.

public class NumberConversion {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Usage: java NumberConversion <number>");
            return;
        }

        int number = Integer.parseInt(args[0]);

        System.out.println("Given Number : " + number);
        System.out.println("Binary equivalent : " + Integer.toBinaryString(number));
        System.out.println("Octal equivalent : " + Integer.toOctalString(number));
        System.out.println("Hexadecimal equivalent : " + Integer.toHexString(number));
    }
}
