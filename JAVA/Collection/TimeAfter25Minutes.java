import java.time.LocalTime;

public class TimeAfter25Minutes {

    public static void main(String[] args) {

        // Get Current Time
        LocalTime currentTime = LocalTime.now();

        // Time after 25 minutes
        LocalTime after25Minutes = currentTime.plusMinutes(25);

        // Display the times
        System.out.println("Current Time       : " + currentTime);
        System.out.println("Time After 25 Mins : " + after25Minutes);

    }

}