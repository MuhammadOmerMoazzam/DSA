package pkg2023f.bse.pkg084.lab02.task3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee> {
    private int empId;
    private String empName;
    private String empGender;
    private int yearOfJoining;
    private String department;

    public Employee(int empId, String empName, 
            String empGender, int yearOfJoining, String department){
        this.empId = empId;
        this.empName = empName;
        this.empGender = empGender;
        this.yearOfJoining = yearOfJoining;
        this.department = department;
    }
    public int getEmpId() { return empId; }
    public String getEmpName() { return empName; }
    public String getEmpGender() { return empGender; }
    public int getYearOfJoining() { return yearOfJoining; }
    public String getDepartment() { return department; }

    public int compareTo(Employee other) {
        return Integer.compare(this.yearOfJoining, other.yearOfJoining);
    }
    public String toString() {
        return "Employee{" +
                "Emp_id=" + empId +
                ", Emp_Name='" + empName + '\'' +
                ", Emp_Gender='" + empGender + '\'' +
                ", Year_of_Joining=" + yearOfJoining +
                ", Department='" + department + '\'' +
                '}';
    }
}

class NameComparator implements Comparator<Employee>{
    public int compare(Employee e1, Employee e2) {
        return e1.getEmpName().compareTo(e2.getEmpName());
    }
}

public class BSE084Lab02Task3 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(776, "Omer", "Male", 2010, "HR"));
        employees.add(new Employee(777, "Moazzam", "Male", 2018, "IT"));
        employees.add(new Employee(778, "Taha", "Male", 2012, "Finance"));
        employees.add(new Employee(779, "Sultan", "Male", 2020, "IT"));
        employees.add(new Employee(780, "Ahmed", "Male", 2016, "Marketing"));
        
        Collections.sort(employees);
        System.out.println("Employees sorted by Year of Joining:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        
        employees.sort(new NameComparator());
        System.out.println("\nEmployees sorted by Name:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
