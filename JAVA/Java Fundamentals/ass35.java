//Write a Java program to find the biggest number in a 3×3 array.
//• The program should receive 9 integer numbers as command-line arguments.
//• If fewer than 9 arguments are passed, print: Please enter 9 integer numbers
class ass35 {
    public static void main(String[] args) {

        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }

        int[][] arr = new int[3][3];
        int k = 0;
        int max;

        // Fill the 3x3 array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(args[k]);
                k++;
            }
        }
        // Assume first element is the largest
        max = arr[0][0];
        // Print the array and find the largest element
        System.out.println("The given array is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("\nThe biggest number in the given array is " + max);
    }
}
