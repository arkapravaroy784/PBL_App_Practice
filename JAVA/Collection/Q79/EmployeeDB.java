import java.util.ArrayList;

public class EmployeeDB {

    private ArrayList<Employee> list = new ArrayList<>();

    // Add Employee
    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    // Delete Employee
    public boolean deleteEmployee(int empId) {

        for (Employee e : list) {

            if (e.getEmpId() == empId) {
                list.remove(e);
                return true;
            }

        }

        return false;
    }

    // Show Pay Slip
    public String showPaySlip(int empId) {

        for (Employee e : list) {

            if (e.getEmpId() == empId) {
                return "Pay Slip for Employee ID " + empId +
                        "\nEmployee Name : " + e.getEmpName() +
                        "\nSalary : " + e.getSalary();
            }

        }

        return "Employee not found.";
    }

    // Return Employee List
    public ArrayList<Employee> getEmployeeList() {
        return list;
    }

}