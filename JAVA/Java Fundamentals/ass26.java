import java.util.Arrays;

class ass26 {
    public static void main(String[] args) {

        // Initialize the array
        int[] arr = {5, 2, 8, 1, 9, 3};

        // Sort the array
        Arrays.sort(arr);

        System.out.println("Smallest 2 numbers:");
        System.out.println(arr[0]);
        System.out.println(arr[1]);

        System.out.println("Largest 2 numbers:");
        System.out.println(arr[arr.length - 2]);
        System.out.println(arr[arr.length - 1]);
    }
}