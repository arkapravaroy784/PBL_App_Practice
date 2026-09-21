public class TestFactorial {

    public static void main(String[] args) {

        // Create Calculator object
        Calculator calculator = new Calculator();

        // Method Reference
        Factorial factorial = calculator::factorial;

        int number = 5;

        int result = factorial.calculate(number);

        System.out.println("Number : " + number);
        System.out.println("Factorial : " + result);

    }

}