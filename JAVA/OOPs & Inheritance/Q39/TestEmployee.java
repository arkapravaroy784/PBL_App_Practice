class TestEmployee {

    public static void main(String[] args) {

        Employee emp = new Employee(
                "Rahul",
                850000,
                2023,
                "INS12345");

        System.out.println("Employee Name : " + emp.getName());
        System.out.println("Annual Salary : " + emp.getAnnualSalary());
        System.out.println("Year Started : " + emp.getYearStarted());
        System.out.println("Insurance Number : " + emp.getInsuranceNumber());
    }
}