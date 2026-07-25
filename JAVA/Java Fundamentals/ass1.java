//Write a Java program that accepts two Strings as command-line arguments and generates the output in the required format.
class ass1 {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Please pass two command line arguments.");
            return;
        }

        System.out.println(args[0] + " Technologies " + args[1]);
    }
}
