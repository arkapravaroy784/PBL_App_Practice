//Write a Java program to print the sum of the elements of an array following the given condition:
//• If the array contains 6 followed by 7, ignore 6, 7, and all the numbers between them while calculating the sum.
//• Add only the remaining elements.

class ass29 {
    public static void main(String[] args) {

        // Initialize the array
        int[] arr = {10, 3, 6, 1, 2, 7, 9};

        int sum = 0;
        boolean ignore = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 6) {
                ignore = true;
            }

            if (!ignore) {
                sum = sum + arr[i];
            }

            if (ignore && arr[i] == 7) {
                ignore = false;
            }
        }

        System.out.println("Sum = " + sum);
    }
}
