//Write a Java program to initialize an integer array and print the sum and average of the array elements.
class ass22 {
    public static void main(String[] args) {

        // Initialize the array
        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;

        // Calculate sum
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        // Calculate average
        double average = (double) sum / arr.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
