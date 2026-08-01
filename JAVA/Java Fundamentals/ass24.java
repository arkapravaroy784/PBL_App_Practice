//Write a Java program to initialize an integer array and check if a given number is present in the array.
• If the number is not found, print -1.
• Otherwise, print the index of the given number in the array.
class ass24 {
    public static void main(String[] args) {

        // Initialize the array
        int[] arr = {1, 4, 34, 56, 7};

        // Search element
        int search = 56;

        int index = -1;

        // Search for the element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
