//Write a Java program to remove the duplicate elements from an integer array and print the resulting array.
class ass28 {
    public static void main(String[] args) {

        // Initialize the array
        int[] arr = {12, 34, 12, 45, 67, 89};

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            // Check if arr[i] has appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
