// Create an interface named Test with one abstract method:
//int myFunction(int a, int b, int c);
//Create two reference variables:
//• t1 → Adds three integers.
//• t2 → Multiplies three integers.
//Implement both using lambda expressions.
//Call myFunction() using both references and print the results.
@FunctionalInterface
interface Test {

    int myFunction(int a, int b, int c);

}

public class TestLambda {

    public static void main(String[] args) {

        // Lambda expression for addition
        Test t1 = (a, b, c) -> a + b + c;

        // Lambda expression for multiplication
        Test t2 = (a, b, c) -> a * b * c;

        System.out.println("Addition = " + t1.myFunction(10, 20, 30));
        System.out.println("Multiplication = " + t2.myFunction(10, 20, 30));

    }

}
