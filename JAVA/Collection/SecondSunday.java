import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class SecondSunday {

    public static void main(String[] args) {

        // Current Date
        LocalDate today = LocalDate.now();

        // First day of next month
        LocalDate nextMonth = today.plusMonths(1).withDayOfMonth(1);

        // First Sunday of next month
        LocalDate firstSunday = nextMonth.with(
                TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));

        // Second Sunday
        LocalDate secondSunday = firstSunday.plusWeeks(1);

        System.out.println("Today's Date           : " + today);
        System.out.println("Second Sunday (Next Month): " + secondSunday);

    }

}