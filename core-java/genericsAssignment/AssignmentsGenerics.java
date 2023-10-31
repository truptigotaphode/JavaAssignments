package genericsAssignment;

import java.util.*;


public class AssignmentsGenerics {
public static void main(String[] args) {
        
        HashSet<Employee> employeeData = new HashSet<>();

        
        employeeData.add(new Employee(101, "Tanu Garg", 50000, "Testing"));
        employeeData.add(new Employee(102, "Kirti Borkar", 60000, "Development"));
        employeeData.add(new Employee(103, "Usha Gotaphode", 55000, "Finance"));

       
        for (Employee employee : employeeData) {
            employee.printDetails();
            System.out.println();
        }
    }
}


class Employee {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void printDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
