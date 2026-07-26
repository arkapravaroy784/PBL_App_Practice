//Write a Java program to accept a String as a command-line argument and print a Welcome message. ex --> Input: Arka, Output: Welcome Arka
class ass2 {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Please pass one command line argument.");
            return;
        }

        System.out.println("Welcome " + args[0]);
    }
}
