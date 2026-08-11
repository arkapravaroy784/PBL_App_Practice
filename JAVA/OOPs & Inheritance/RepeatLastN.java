import java.util.Scanner;

class RepeatLastN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Get the last n characters
        String lastPart = str.substring(str.length() - n);

        // Print lastPart n times
        for (int i = 0; i < n; i++) {
            System.out.print(lastPart);
        }

        sc.close();
    }
}