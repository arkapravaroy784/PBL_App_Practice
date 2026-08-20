public class Employee {

    public static void main(String[] args) {

        try {

            if (args.length != 2) {
                throw new Exception("Please enter Name and Age.");
            }

            String name = args[0];
            int age = Integer.parseInt(args[1]);

            if (age < 18 || age >= 60) {
                throw new InvalidAgeException(
                        "Age should be between 18 and 59.");
            }

            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Employee age is valid.");

        }

        catch (NumberFormatException e) {
            System.out.println("Age must be a valid integer.");
        }

        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}