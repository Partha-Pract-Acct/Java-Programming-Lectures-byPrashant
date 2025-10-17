/*
 Define a class Employee with private attributes (like name, age, and salary), public methods to get and set
 these attributes, and a package-private method to displayEmployeeDetails.
 Create another class in the same package to test access to the displayEmployeeDetails method
 */

package in.coding.challenge76;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Partha", 21, 25000);
        System.out.println(emp.getEmployeeDetails());

        emp.setName("MZ");
        System.out.println(emp.getEmployeeDetails());
    }
}
