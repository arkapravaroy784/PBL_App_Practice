//Write a Java program to initialize an integer array with ASCII values and print the corresponding character values in a single row.
class ass25 {
    public static void main(String[] args) {

        // Initialize the array with ASCII values
        int[] arr = {65, 66, 67, 68, 69};

        // Print corresponding characters
        for (int i = 0; i < arr.length; i++) {
            System.out.print((char) arr[i] + " ");
        }
    }
}
