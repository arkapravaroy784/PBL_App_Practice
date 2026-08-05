class Calculator {

    // Static method for integer values
    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Static method for double values
    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}

class TestCalculator {
    public static void main(String[] args) {

        System.out.println("powerInt(2, 3) = " +
                Calculator.powerInt(2, 3));

        System.out.println("powerDouble(2.5, 3) = " +
                Calculator.powerDouble(2.5, 3));
    }
}