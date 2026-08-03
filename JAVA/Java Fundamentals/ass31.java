class ass31 {
    public static void main(String[] args) {

        // Initialize the array
        int[] arr = {1, 0, 1, 0, 0, 1, 1};

        int[] result = new int[arr.length];
        int index = 0;

        // Copy even numbers first
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index] = arr[i];
                index++;
            }
        }

        // Copy odd numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }

        // Print the result array
        System.out.print("Output: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
