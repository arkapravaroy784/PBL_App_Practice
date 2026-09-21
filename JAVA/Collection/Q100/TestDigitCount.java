public class TestDigitCount {

    public static void main(String[] args) {

        // Static Method Reference
        DigitCount digitCount = NumberUtility::digitCount;

        int number = 123456;

        int result = digitCount.count(number);

        System.out.println("Number : " + number);
        System.out.println("Number of Digits : " + result);

    }

}