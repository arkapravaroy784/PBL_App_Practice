public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        // Create Employee Objects
        Employee e1 = new Employee(
                101,
                "Arka",
                "arka@gmail.com",
                "Male",
                85000);

        Employee e2 = new Employee(
                102,
                "Rahul",
                "rahul@gmail.com",
                "Male",
                70000);

        Employee e3 = new Employee(
                103,
                "Priya",
                "priya@gmail.com",
                "Female",
                65000);

        // Add Employees
        db.addEmployee(e1);
        db.addEmployee(e2);
        db.addEmployee(e3);

        // Display All Employees
        System.out.println("----- Employee Details -----");

        for (Employee e : db.getEmployeeList()) {
            e.GetEmployeeDetails();
            System.out.println();
        }

        // Display Pay Slip
        System.out.println("----- Pay Slip -----");
        System.out.println(db.showPaySlip(102));

        // Delete Employee
        System.out.println("\nDeleting Employee with ID 102...");

        if (db.deleteEmployee(102)) {
            System.out.println("Employee Deleted Successfully.");
        } else {
            System.out.println("Employee Not Found.");
        }

        // Display Employees After Deletion
        System.out.println("\n----- Employee Details After Deletion -----");

        for (Employee e : db.getEmployeeList()) {
            e.GetEmployeeDetails();
            System.out.println();
        }

    }
}