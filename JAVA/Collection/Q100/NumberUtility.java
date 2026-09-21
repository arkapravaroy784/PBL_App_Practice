public class NumberUtility {

    // Static Method
    public static int digitCount(int n) {

        n = Math.abs(n);

        if (n == 0) {
            return 1;
        }

        int count = 0;

        while (n > 0) {

            count++;
            n = n / 10;

        }

        return count;

    }

}