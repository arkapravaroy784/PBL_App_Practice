import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter the name of Student " + i + ":");
                String name = sc.nextLine();

                int sum = 0;

                System.out.println("Enter marks in 3 subjects:");

                for (int j = 1; j <= 3; j++) {

                    int marks = Integer.parseInt(sc.nextLine());

                    if (marks < 0) {
                        throw new NegativeValueException("Marks cannot be negative.");
                    }

                    if (marks > 100) {
                        throw new OutOfRangeException("Marks should be between 0 and 100.");
                    }

                    sum += marks;
                }

                double average = sum / 3.0;

                System.out.println("Student Name : " + name);
                System.out.println("Average Marks : " + average);
                System.out.println();

            }

        }

        catch (NumberFormatException e) {
            System.out.println(e);
        }

        catch (NegativeValueException e) {
            System.out.println(e.getMessage());
        }

        catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }

}