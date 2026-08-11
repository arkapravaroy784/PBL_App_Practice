//Write a Java program that accepts a string (which contains * in it). The program should return a new string in which the following characters are removed:
//•	The * character. 
//•	The character immediately to the left of *. 
//•	The character immediately to the right of *.

import java.util.Scanner;

class RemoveStar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int index = str.indexOf('*');

        String result = str.substring(0, index - 1)
                        + str.substring(index + 2);

        System.out.println(result);

        sc.close();
    }
}
