
public class Employee extends Person {
    private int empId;
    private double salary;

    public Employee(String name, String dob, int empId, double salary) {
        super(name, dob);
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Salary: $" + salary);
        displayPersonName(); // Calling displayPersonName() method from the Person class
        calculateAge(); // Calling displayAge() method from the Person class
    }

    public static void main(String[] args)  {
        Employee employee = new Employee("Vijay", "2004-05-22", 1001, 60000);
        employee.displayEmployeeDetails();
    }
}
