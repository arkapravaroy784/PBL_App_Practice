// Write a Java program to initialize an integer array and find the maximum and minimum value of the array.

class ass23 {
    public static void main(String[] args) {

        // Initialize the array
        int[] arr = {25, 10, 45, 5, 30};

        // Assume first element is both maximum and minimum
        int max = arr[0];
        int min = arr[0];

        // Find maximum and minimum
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
