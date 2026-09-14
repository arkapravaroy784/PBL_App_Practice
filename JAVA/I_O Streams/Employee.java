//Create a class called Employee with the following properties:
// name (String)
// dateOfBirth (java.util.Date)
// department (String)
// designation (String)
// salary (double)
//Create:
// Getter and Setter methods.
// A no-argument constructor.
// A parameterized constructor.
//Then:
//1. Create an Employee object.
//2. Serialize it into a file named data.
//3. Deserialize the object from the file.
//4. Print all its properties.

import java.io.*;
import java.util.Date;
public class Employee implements Serializable {
private static final long serialVersionUID = 1L;
private String name;
private Date dateOfBirth;
private String department;
private String designation;
private double salary;
// No-Argument Constructor
public Employee() {
}
// Parameterized Constructor
public Employee(String name, Date dateOfBirth,
String department,
String designation,
double salary) {
this.name = name;
this.dateOfBirth = dateOfBirth;
this.department = department;
this.designation = designation;

this.salary = salary;
}
// Getters and Setters
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public Date getDateOfBirth() {
return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
this.dateOfBirth = dateOfBirth;
}
public String getDepartment() {
return department;
}
public void setDepartment(String department) {
this.department = department;
}
public String getDesignation() {
return designation;
}
public void setDesignation(String designation) {
this.designation = designation;
}
public double getSalary() {
return salary;
}
public void setSalary(double salary) {
this.salary = salary;
}
// Display Method
public void display() {
System.out.println("Name : " + name);
System.out.println("Date of Birth: " + dateOfBirth);
System.out.println("Department : " + department);
System.out.println("Designation : " + designation);
System.out.println("Salary : " + salary);
}
public static void main(String[] args) {

try {
// Create Employee Object
Employee emp = new Employee(
"Arkaprava Roy",
new Date(),
"AI & ML",
"Data Scientist",
85000);
// Serialization
FileOutputStream fos = new FileOutputStream("data");
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(emp);
oos.close();
fos.close();
System.out.println("Employee object serialized successfully.\n");
// Deserialization
FileInputStream fis = new FileInputStream("data");
ObjectInputStream ois = new ObjectInputStream(fis);
Employee employee = (Employee) ois.readObject();
ois.close();
fis.close();
System.out.println("Employee object deserialized successfully.\n");
employee.display();
} catch (Exception e) {
System.out.println(e);
}
}
}
