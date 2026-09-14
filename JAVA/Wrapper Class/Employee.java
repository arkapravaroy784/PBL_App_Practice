public class Employee implements Cloneable {

    private int empId;
    private String name;
    private double salary;

    // Constructor
    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Setter Methods
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Display Method
    public void display() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : " + salary);
    }

    // Clone Method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {

        try {

            // Original Object
            Employee emp1 = new Employee(101, "Arka", 50000);

            // Clone Object
            Employee emp2 = (Employee) emp1.clone();

            // Modify Original Object
            emp1.setName("Rahul");
            emp1.setSalary(70000);

            System.out.println("Original Employee");
            emp1.display();

            System.out.println("\nCloned Employee");
            emp2.display();

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}