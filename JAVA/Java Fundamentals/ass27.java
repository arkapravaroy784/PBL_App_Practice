// Write a Java program to initialize an integer array and print the elements in sorted order.

import java.util.Arrays;

class ass27 {
    public static void main(String[] args) {

        // Initialize the array
        int[] arr = {25, 10, 45, 5, 30};

        // Sort the array
        Arrays.sort(arr);

        // Print the sorted array
        System.out.println("Sorted Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
