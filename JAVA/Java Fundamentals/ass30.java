//Write a Java program to print a version of the given array where all the 10's have been removed.
//• The remaining elements should be shifted to the left.
//• The empty spaces at the end of the array should be filled with 0.
//• You may modify the original array or create a new array.
class ass30 {
    public static void main(String[] args) {

        // Initialize the array
        int[] arr = {1, 10, 10, 2};

        int[] result = new int[arr.length];
        int index = 0;

        // Copy all elements except 10
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 10) {
                result[index] = arr[i];
                index++;
            }
        }

        // Print the new array
        System.out.print("Output: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
