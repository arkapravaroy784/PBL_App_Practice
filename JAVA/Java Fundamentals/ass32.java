//Given an integer array, print true if every element in the array is either 1 or 4. Otherwise, print false.

class ass32 {
    public static void main(String[] args) {

        // Initialize the array
        int[] arr = {1, 4, 1, 4};

        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                flag = false;
                break;
            }
        }

        System.out.println(flag);
    }
}
