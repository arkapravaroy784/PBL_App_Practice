//Write a Java program to accept two integers as command-line arguments and print thecsum of the two numbers.
class ass3 {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Please pass two integer command line arguments.");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
