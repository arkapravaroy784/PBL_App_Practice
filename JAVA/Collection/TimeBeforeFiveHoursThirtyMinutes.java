import java.time.LocalTime;

public class TimeBeforeFiveHoursThirtyMinutes {

    public static void main(String[] args) {

        // Get Current Time
        LocalTime currentTime = LocalTime.now();

        // Time before 5 hours and 30 minutes
        LocalTime previousTime = currentTime.minusHours(5).minusMinutes(30);

        // Display the times
        System.out.println("Current Time                 : " + currentTime);
        System.out.println("Time Before 5 Hours 30 Mins  : " + previousTime);

    }

}