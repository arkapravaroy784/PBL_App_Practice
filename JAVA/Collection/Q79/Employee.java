public class Employee {

    // Private Variables
    private int id;
    private String name;
    private double salary;

    // Parameterized Constructor
    public Employee(int id, String name, double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    // Getter Methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setter Methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {

        return "Employee [id=" + id
                + ", name=" + name
                + ", salary=" + salary + "]";

    }

}