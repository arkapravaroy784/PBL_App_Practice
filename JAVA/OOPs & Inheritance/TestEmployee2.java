import java.util.Optional;

// User-defined Exception
class InvalidEmployeeException extends Exception {

    InvalidEmployeeException(String message) {
        super(message);
    }
}

// Employee Class
class Employee {

    private int id;
    private String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
    }
}

class TestEmployee2 {

    public static void main(String[] args) {

        Employee emp = null;

        try {

            Optional<Employee> employee = Optional.ofNullable(emp);

            if (employee.isPresent()) {
                employee.get().display();
            } else {
                throw new InvalidEmployeeException("Invalid Employee");
            }

        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}