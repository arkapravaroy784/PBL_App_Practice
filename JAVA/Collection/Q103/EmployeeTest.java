import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Employee> employees = new ArrayList<>();

        // Add Employee Objects
        employees.add(new Employee(101, "Arka", 22, "Kolkata"));
        employees.add(new Employee(102, "Rahul", 25, "Pune"));
        employees.add(new Employee(103, "Priya", 24, "Delhi"));
        employees.add(new Employee(104, "Sneha", 27, "Pune"));
        employees.add(new Employee(105, "Amit", 30, "Mumbai"));

        System.out.println("All Employees:");

        employees.forEach(System.out::println);

        // Filter Employees whose location is Pune
        List<Employee> puneEmployees = employees.stream()
                .filter(emp -> emp.getLocation().equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        System.out.println("\nEmployees from Pune:");

        puneEmployees.forEach(System.out::println);

    }

}