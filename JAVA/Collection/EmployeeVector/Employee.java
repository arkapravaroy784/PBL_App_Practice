public class Employee {
 private int empId;
 private String empName;
 private String department;
 private double salary;
 // Parameterized Constructor
 public Employee(int empId, String empName,
 String department, double salary) {
 this.empId = empId;
 this.empName = empName;
 this.department = department;
 this.salary = salary;
 }
 // Display Method
 public void display() {
 System.out.println("Employee ID : " + empId);
 System.out.println("Employee Name : " + empName);
 System.out.println("Department : " + department);
 System.out.println("Salary : " + salary);
 }
}
