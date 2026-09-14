import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EmployeeVectorDemo {

    public static void main(String[] args) {

        Vector<Employee> employees = new Vector<>();

        employees.add(new Employee(101, "Arka", "AI & ML", 85000));
        employees.add(new Employee(102, "Rahul", "Software", 70000));
        employees.add(new Employee(103, "Priya", "Testing", 65000));

        System.out.println("Using Iterator\n");

        Iterator<Employee> iterator = employees.iterator();

        while (iterator.hasNext()) {

            Employee emp = iterator.next();
            emp.display();
            System.out.println();

        }

        System.out.println("Using Enumeration\n");

        Enumeration<Employee> enumeration = employees.elements();

        while (enumeration.hasMoreElements()) {

            Employee emp = enumeration.nextElement();
            emp.display();
            System.out.println();

        }

    }

}