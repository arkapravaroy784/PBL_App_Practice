import java.time.LocalDate;
import java.time.Period;

public class ExperienceCalculator {

    public static void main(String[] args) {

        // Joining Date
        LocalDate joiningDate = LocalDate.of(2022, 7, 15);

        // Current Date
        LocalDate currentDate = LocalDate.now();

        // Calculate Experience
        Period experience = Period.between(joiningDate, currentDate);

        System.out.println("Joining Date : " + joiningDate);
        System.out.println("Current Date : " + currentDate);

        System.out.println("\nExperience in Wipro:");

        System.out.println(experience.getYears() + " Years "
                + experience.getMonths() + " Months "
                + experience.getDays() + " Days");

    }

}