import java.time.LocalDate;

public class LeapYear {

    public static void main(String[] args) {

        // Get Current Date
        LocalDate today = LocalDate.now();

        // Get Current Year
        int year = today.getYear();

        // Check Leap Year
        if (today.isLeapYear()) {

            System.out.println(year + " is a Leap Year.");

        } else {

            System.out.println(year + " is Not a Leap Year.");

        }

    }

}