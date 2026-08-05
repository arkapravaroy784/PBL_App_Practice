//Create a new class called Calculator with the following methods:
//1. A static method called powerInt(int num1, int num2).
//o This method should return num1 raised to the power num2.
//2. A static method called powerDouble(double num1, int num2).
//o This method should return num1 raised to the power num2.
//3. Invoke both the methods and test the functionalities.
//Hint: Use Math.pow(double, double) to calculate the power.
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
