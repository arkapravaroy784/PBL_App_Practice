class ass33 {
    public static void main(String[] args) {

        // Initialize the arrays
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        // Create a new array containing the middle elements
        int[] result = {a[1], b[1]};

        // Print the result
        System.out.print("Output: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}