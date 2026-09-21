public class Employee {

    // Instance Variables
    private int empNo;
    private String name;
    private int age;
    private String location;

    // Parameterized Constructor
    public Employee(int empNo, String name, int age, String location) {

        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;

    }

    // Getter Methods
    public int getEmpNo() {
        return empNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {

        return "Employee [empNo=" + empNo +
                ", name=" + name +
                ", age=" + age +
                ", location=" + location + "]";

    }

}