public class Employee {

    private int empId;
    private String empName;
    private String email;
    private String gender;
    private float salary;

    // Default Constructor
    public Employee() {

    }

    // Parameterized Constructor
    public Employee(int empId, String empName, String email,
                    String gender, float salary) {

        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    // Getters
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public float getSalary() {
        return salary;
    }

    // Setters
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    // Display Employee Details
    public void GetEmployeeDetails() {

        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Email         : " + email);
        System.out.println("Gender        : " + gender);
        System.out.println("Salary        : " + salary);
    }
}